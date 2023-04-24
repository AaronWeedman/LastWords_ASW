import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/*
 * This class uses twilio to send an SMS
 * 
 * @author Aaron Weedman
 * @version 3.0
 * Last Words
 * Spring 2023
 */

public class SMS {

	FinalWords word = new FinalWords();//creates a new object from the FinalWords class
	
	/*
	 * The ACCOUNT_SID and AUTH_TOKEN are both Strings that are given when
	 * signing up for twilio
	 */
	
  public static final String ACCOUNT_SID = "AC2d1b9345e1bf4b51f786ec7807337a4c";
  public static final String AUTH_TOKEN = "bf27e105f782382392da1796ea08b5ef";

  /*
   * the send method will send an SMS
   */
  
  public String send() {
	  
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    Message.creator(
        new PhoneNumber("+15028218114"),//my phone number
        new PhoneNumber("+18885764479"),//trial phone number from twilio
        
      word.toString()//this line of code represents what will be sent in the message
      )
      .create();
    return null;
    
  }//end send
  
}//end class