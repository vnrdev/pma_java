package valter.samples_10;

import com.pathomation.Core;
import com.pathomation.CoreAdmin;
import java.util.logging.Level;
import java.util.logging.Logger;
import valter.samples_10.util.PMAconnect;
import valter.models.admin.UserCreate;

/**
 * @author Valter
 */
public class UserCreateTest {

    public static void main(String[] args) {
        if (PMAconnect.connect()) {
            String sessionID = PMAconnect.getSessionID();

            String admSessionID = sessionID; 
            String login = PMAconnect.pmaCoreUser();
            String firstName = PMAconnect.getPmaCorePass();
            String lastName = "test";
            String email = "some@email.com";
            String pwd = "xyz";
            Boolean canAnnotate = false;
            Boolean isAdmin = false;
            Boolean isSuspended = false;
                    
            try {                                
                UserCreate user = new UserCreate(admSessionID, login, firstName, lastName, email, pwd, canAnnotate, isAdmin, isSuspended);
                boolean userCreated = CoreAdmin.addUser(user);
                System.out.println("User created: " + userCreated);

            } catch (Exception ex) {
                Logger.getLogger(IdentifyBarCodeText.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Could not connect.");
        }
    }
}
