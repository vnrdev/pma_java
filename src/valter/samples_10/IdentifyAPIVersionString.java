package valter.samples_10;

import com.pathomation.Core;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import valter.samples_10.util.PMAconnect;
        
/**
 * @author Valter
*/

public class IdentifyAPIVersionString {
    public static void main(String[] args) {
        if(PMAconnect.connect()) {
            try {
                List<Integer> apiVersionList = Core.getAPIVersion(PMAconnect.getPmaCoreServer());
                
                for(Integer integer : apiVersionList) {
                    System.out.println("ver: " + integer);
                }
                
            } catch (Exception ex) {
                Logger.getLogger(IdentifyAPIVersionString.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Could not connect.");
        }
    }

}
