import java.util.TimerTask;

/*
 * This class represents what will occur when the timer runs out.
 * 
 * @author Aaron Weedman
 * @version 3.0
 * Last Words
 * Spring 2023
 */

public class MyTimerTask extends TimerTask{
	
	/*
	 * the run method is a required method of the TimerTask class and contains
	 * the code that will be executed when the timer runs out.
	 */
    		
        public void run() {
            
        	SMS msg = new SMS();//creates a new object of the SMS class
        	FinalWords word = new FinalWords();//creates a new object of the FinalWords class
        	
        	msg.send();//executes the send() method from the SMS class
        	System.out.println(word.toString());//prints the toString from the FinalWords class
            System.exit(0);//takes the button away after time runs out.
            
        }//end run
    }//end class