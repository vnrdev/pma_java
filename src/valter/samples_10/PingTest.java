package valter.samples_10;

import com.pathomation.Core;
import java.util.logging.Level;
import java.util.logging.Logger;
import valter.samples_10.util.PMAconnect;

/**
 * @author Valter
 */
public class PingTest {

    public static void main(String[] args) {
        if (PMAconnect.connect()) {
            String sessionID = PMAconnect.getSessionID();

            try {
                boolean pingReply = Core.ping(sessionID);
                System.out.println("Ping reply: " + pingReply);

            } catch (Exception ex) {
                Logger.getLogger(IdentifyBarCodeText.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Could not connect.");
        }
    }
}
