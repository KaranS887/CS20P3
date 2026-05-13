package simplePhidgets;
import com.phidget22.*;

public class ReadButton {

		    public static void main(String[] args) throws Exception{
		        
		        //Create | Here you've created a DigitalInput object for your button. An object represents how you interact with your device. DigitalInput is a class from the Phidgets library that's used to read the state of your button.
		        DigitalInput redButton = new DigitalInput();

		        //Address | This tells your program where to find the device you want to work with. Your button is connected to port 0 and your code reflects that. IsHubPortDevice must be set if you are not using a Smart Phidget (more on this later).
		        redButton.setHubPort(5);
		        redButton.setIsHubPortDevice(true);

		        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
		        redButton.open(1000);
		        boolean last = redButton.getState();

		        //Use your Phidgets | Here is where you use your Phidgets! This code checks the state of the button and prints true/false when the button is pressed/released. The sleep function means the button state is only checked every 150 milliseconds. Sleeping is used to make it easier to read the console output and to put less stress on your CPU.
		        while(true){
		        	boolean current = redButton.getState();
		        	
		            if (current != last) {
		            	System.out.println("State changed");
		            	last = current;
		            };
		            Thread.sleep(150);
		        }
		    }
		
		  

	}


