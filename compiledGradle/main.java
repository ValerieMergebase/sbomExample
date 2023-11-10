import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Main {
    public static final String ACCOUNT_SID = "YOUR_TWILIO_ACCOUNT_SID";
    public static final String AUTH_TOKEN = "YOUR_TWILIO_AUTH_TOKEN";

    public static void main(String[] args) {
        try {
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            Message message = Message.creator(
                    new PhoneNumber("DESTINATION_PHONE_NUMBER"), // To number
                    new PhoneNumber("YOUR_TWILIO_PHONE_NUMBER"), // From Twilio Number
                    "Hello from Twilio via Java!").create();

            System.out.println("Twilio Message Sent. SID: " + message.getSid());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}