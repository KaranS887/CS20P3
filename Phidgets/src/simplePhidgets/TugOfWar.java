package simplePhidgets;
import com.phidget22.*;

public class TugOfWar {

	public static void main(String[] args) throws Exception{
		DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();
        
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        int count = 0;
        int count2 = 0;
      while(count != 10 && count2 != 10) {  
        if(redButton.getState()) {
        	redLED.setState(true);
        	System.out.println("Red: " + (count +=1));
        }
        else {redLED.setState(false);
        }
        if(greenButton.getState()) {
        	greenLED.setState(true);
        	System.out.println("Green: " + (count2 +=1));
        }
        else {greenLED.setState(false);
        

        }
        
        
        Thread.sleep(050);
        
        if(count == 10) {
        	System.out.println("Red has won");
        	break;
        }
        else if (count2 == 10) {
        	System.out.println("Green has won");
        	break;
        }
     
		
		
		

		

	}

} }
