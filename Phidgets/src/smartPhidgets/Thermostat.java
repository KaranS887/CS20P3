package smartPhidgets;
import com.phidget22.*;
public class Thermostat {

	public static void main(String[] args) throws Exception{
		TemperatureSensor temperatureSensor = new TemperatureSensor();
		DigitalOutput redLED = new DigitalOutput();
		DigitalOutput greenLED = new DigitalOutput();
		DigitalInput redButton = new DigitalInput();   
		DigitalInput greenButton = new DigitalInput();
		redLED.setHubPort(1);
		redLED.setIsHubPortDevice(true);
		greenLED.setHubPort(4);
		greenLED.setIsHubPortDevice(true);
		redButton.setHubPort(0);
		redButton.setIsHubPortDevice(true);
		greenButton.setHubPort(5);
		greenButton.setIsHubPortDevice(true);
		temperatureSensor.open(1000);
		redLED.open(1000);
		greenLED.open(1000);
		redButton.open(1000);
		greenButton.open(1000);
		
		int setTemperature = 21;
		int printCounter = 0;
		
		while(true) {
			if (greenButton.getState()) {
				setTemperature ++;
				System.out.println("New Target Temperature: " + setTemperature);
			}
			else if(redButton.getState()) {
				
				setTemperature --;
				System.out.println("New Target Temperature: " + setTemperature);
			}
			Thread.sleep(150); 
			
			if(Math.abs(temperatureSensor.getTemperature() - setTemperature) <= 2) {
				greenLED.setState(true);
				redLED.setState(false);
			}
			else {
				greenLED.setState(false);
				redLED.setState(true);
			}
			if (printCounter >= 66) { 
		        System.out.println("--- Status Update ---");
		        System.out.println("Current Temp: " + temperatureSensor.getTemperature() + "°C");
		        System.out.println("Set Temp: " + setTemperature + "°C");
		        printCounter = 0; // Reset counter
		    }

		    printCounter++;
		    Thread.sleep(150); 

			
			
			
		}
		
		


		

	}

}
