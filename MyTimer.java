import java.util.Timer;

/*
 * This class represents a timer that will execute a certain task.
 * 
 * @author Aaron Weedman
 * @version 3.0
 * Last Words
 * Spring 2023
 */

public class MyTimer{

    private Timer timer;//timer will be used to execute a method at a specific time.

    /*
     * creates a new instance of the MyTimer class with a specified duration in seconds.
     * @param seconds 
     */
    
    public MyTimer(int seconds) {
        timer = new Timer();//creates a new Timer object
        timer.schedule(new MyTimerTask(), seconds * 1000);//schedules a new task to be executed by the timer.
    }//end constructor

}//end class