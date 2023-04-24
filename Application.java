/*
 * The Application class contains the main method which creates the GUI and timer
 */

public class Application{
	
    public static void main(String[] args) {
    	
        MyTimer timer = new MyTimer(9);//creates an instance of MyTimer class with duration of 9 seconds
        
        MyGUI gui = new MyGUI();//creates the GUI
        
    }//end main
    
}//end class