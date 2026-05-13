package OwnProjects;
import com.phidget22.*;

public class reactionTime {

    static DigitalInput redButton;
    static DigitalOutput greenLED;
    static DigitalInput greenButton;
    static DigitalOutput redLED;

    // Use volatile for variables shared between the Main thread and Phidget Event thread
    static volatile long startTime = 0;
    static volatile String activeColor = "NONE"; 
    static volatile boolean falseStart = false;
    static volatile boolean reactionSuccess = false;
    static volatile boolean isPaused = false;
    
    static int totalScore = 0;
    static double reactWindow = 1.5; 
    static int level = 1;

    // Consolidate scoring and level-up logic
    public static void handleCorrectPress(String color) {
        double timeDiff = (System.currentTimeMillis() - startTime) / 1000.0;
        
        // Use current reactWindow for scoring calculation instead of hardcoded 1.5
        int points = (int)((reactWindow - timeDiff) * 1000); 
        totalScore += Math.max(50, points);
        reactionSuccess = true; // Signals the main loop to stop waiting
        
        System.out.println("CORRECT! TIME: " + timeDiff + "s | Score: " + totalScore);

        if (totalScore >= (level * 2000)) {
            level++;
            reactWindow *= 0.8; 
            try { levelUpCelebration(); } catch (Exception ex) {}
        }
    }

    public static void levelUpCelebration() throws Exception {
        isPaused = true;
        System.out.println("!!! LEVEL " + level + " !!! Window: " + String.format("%.2f", reactWindow) + "s");
        for (int i = 0; i < 5; i++) {
            greenLED.setState(true); redLED.setState(false);
            Thread.sleep(150);
            greenLED.setState(false); redLED.setState(true);
            Thread.sleep(150);
        }
        redLED.setState(false);
        isPaused = false;
    }

    public static void main(String[] args) throws Exception {
        redButton = new DigitalInput();
        greenLED = new DigitalOutput();
        greenButton = new DigitalInput();
        redLED = new DigitalOutput();

        redButton.setHubPort(0); redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5); greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4); greenLED.setIsHubPortDevice(true);
        redLED.setHubPort(1); redLED.setIsHubPortDevice(true);

        redButton.open(5000); greenButton.open(5000);
        greenLED.open(1000); redLED.open(1000);

        // Single listener logic for both buttons
        DigitalInputStateChangeListener listener = e -> {
            try {
                if (!e.getState() || isPaused) return; // Only trigger on press

                DigitalInput ch = (DigitalInput)e.getSource();
                String pressedColor = (ch.getHubPort() == 0) ? "RED" : "GREEN";

                if (activeColor.equals(pressedColor)) {
                    handleCorrectPress(pressedColor);
                    activeColor = "NONE";
                    greenLED.setState(false); redLED.setState(false);
                } else if (activeColor.equals("NONE")) {
                    System.out.println("FALSE START!");
                    falseStart = true;
                } else {
                    System.out.println("WRONG BUTTON!");
                    activeColor = "NONE"; // Forces a "Too Slow" / Failure in main loop
                }
            } catch (PhidgetException ex) {}
        };

        redButton.addStateChangeListener(listener);
        greenButton.addStateChangeListener(listener);

        while (true) {
            while (isPaused) Thread.sleep(100);

            // Wait Phase (Randomized)
            activeColor = "NONE";
            reactionSuccess = false;
            int waitTimer = (int)(Math.random() * 3000) + 2000; // 2-5 seconds
            
            long waitStart = System.currentTimeMillis();
            while (System.currentTimeMillis() - waitStart < waitTimer) {
                if (falseStart) {
                    greenLED.setState(true); redLED.setState(true);
                    Thread.sleep(2000);
                    greenLED.setState(false); redLED.setState(false);
                    falseStart = false;
                    waitStart = System.currentTimeMillis(); // Reset wait
                    System.out.println("Don't touch! Restarting wait...");
                }
                Thread.sleep(50);
            }

            // Go Phase
            int ledChoice = (int) (Math.random() * 2);
            if (ledChoice == 0) {
                greenLED.setState(true);
                activeColor = "GREEN";
            } else {
                redLED.setState(true);
                activeColor = "RED";
            }
            
            System.out.println("GO!");
            startTime = System.currentTimeMillis();

            // Precision Window: Wait for reaction OR timeout
            long reactionDeadline = (long)(reactWindow * 1000);
            long phaseStart = System.currentTimeMillis();
            while (System.currentTimeMillis() - phaseStart < reactionDeadline && !reactionSuccess) {
                Thread.sleep(10); // Polling interval
            }

            // Results Check
            if (!reactionSuccess) {
                System.out.println("\nTOO SLOW OR WRONG! Game Over.");
                System.out.println("Final Score: " + totalScore);
                
                totalScore = 0; level = 1; reactWindow = 1.5; // Reset to original 1.5
                
                for(int i=0; i<3; i++) {
                    redLED.setState(true); Thread.sleep(100);
                    redLED.setState(false); Thread.sleep(100);
                }
            }

            greenLED.setState(false);
            redLED.setState(false);
            activeColor = "NONE";
            Thread.sleep(1000); // Short buffer before next round
        }
    }
}
