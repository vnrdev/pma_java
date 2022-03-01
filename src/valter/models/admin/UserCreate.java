package valter.models.admin;

/**
 * @author Valter
*/

public class UserCreate {
    private String admSessionID;             
    private String login;    
    private String firstName;
    private String lastName;
    private String email;
    private String pwd; 
    private Boolean canAnnotate;
    private Boolean isAdmin;
    private Boolean isSuspended;
    
    public UserCreate(){
        
    }

    public UserCreate(String admSessionID, String login, String firstName, String lastName, String email, String pwd) {
        this.admSessionID = admSessionID;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.pwd = pwd;
    }

    public UserCreate(String admSessionID, String login, String firstName, String lastName, String email, String pwd, Boolean canAnnotate, Boolean isAdmin, Boolean isSuspended) {
        this.admSessionID = admSessionID;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.pwd = pwd;
        this.canAnnotate = canAnnotate;
        this.isAdmin = isAdmin;
        this.isSuspended = isSuspended;
    }            

    public String getAdmSessionID() {
        return admSessionID;
    }

    public String getLogin() {
        return login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPwd() {
        return pwd;
    }

    public Boolean getCanAnnotate() {
        return canAnnotate;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public Boolean getIsSuspended() {
        return isSuspended;
    }

    public void setAdmSessionID(String admSessionID) {
        this.admSessionID = admSessionID;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setCanAnnotate(Boolean canAnnotate) {
        this.canAnnotate = canAnnotate;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setIsSuspended(Boolean isSuspended) {
        this.isSuspended = isSuspended;
    }

}
