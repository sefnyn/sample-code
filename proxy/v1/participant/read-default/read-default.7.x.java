// Install the Java helper library from twilio.com/docs/java/install

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.proxy.v1.service.session.Participant;

public class Example {
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "your_auth_token";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        ResourceSet<Participant> participants = Participant.reader(
                "KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
                "KCXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
            .read();

        for(Participant record : participants) {
            System.out.println(record.getSid());
        }
    }
}