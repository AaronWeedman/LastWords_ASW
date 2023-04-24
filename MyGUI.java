import javax.swing.*;
import java.awt.*;

/*
 * This class creates a GUI with a button
 */

public class MyGUI {

    private JFrame frame;//will be used to create the frame for the GUI
    private JButton button;//will be used to create the button for the GUI

    public MyGUI() {
        frame = new JFrame("Last Words");//creates a new Jframe object
        frame.setSize(500, 300);//sets the size to be 500 pixels tall and 300 pixels wide.
        frame.setLayout(new GridLayout(1, 1));//sets button to the middle of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//the program will close when the button is clicked.

        button = new JButton("Click before time runs out!");//creates a new JButton object.
        button.addActionListener(e -> {
            System.out.println("Timer cancelled!");//represents what happens when the button is clicked
            System.exit(0);//exits program
        });

        frame.add(button);//adds the button to the frame
        frame.setVisible(true);//makes the frame visible to the screen.
        
    }//end constructor
    
}//end class