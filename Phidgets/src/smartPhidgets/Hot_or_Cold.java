package smartPhidgets;
import com.phidget22.*;
public class Hot_or_Cold {

	public static void main(String[] args) throws Exception {
		TemperatureSensor temperatureSensor = new TemperatureSensor();
		temperatureSensor.open(1000);
		DigitalOutput redLED = new DigitalOutput();
		DigitalOutput greenLED = new DigitalOutput();

		redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        redLED.open(1000);
        greenLED.open(1000);




		while(true) {
			if (20 < temperatureSensor.getTemperature() && temperatureSensor.getTemperature()  < 29 ) {
				greenLED.setState(true);
				redLED.setState(false);

				System.out.println("Temperature: " + temperatureSensor.getTemperature());}
				else {
					redLED.setState(true);
					greenLED.setState(false);

					System.out.println("Temperature: " + temperatureSensor.getTemperature());
				
				
	 
				
			}
			
			Thread.sleep(500);
			
		}

		

	}

}
