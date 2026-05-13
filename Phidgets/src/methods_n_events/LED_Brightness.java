package methods_n_events;
import com.phidget22.*;
public class LED_Brightness {



	    //Handle Exceptions 
	    public static void main(String[] args) throws Exception{

	        //Create 
	        DigitalOutput redLED = new DigitalOutput();

	        //Address 
	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);

	        //Open 
	        redLED.open(1000);

	        //Use your Phidgets with Duty Cycle | Duty Cycle controls the power to your Phidget (Digital Output object). Duty Cycle values range from 0.0 - 1.0.
	       for(int i = 0; i <= 10 ; i++) {
	    	   	double t = i / 10.0;
		        redLED.setDutyCycle(t);
		        Thread.sleep(1000);
		        System.out.println("Brightness: " + t);
		  
	    	   
	       }
	       Thread.sleep(1000);
	       redLED.setDutyCycle(0.0);
	       System.out.println("Complete");


	    }
	}
	  

