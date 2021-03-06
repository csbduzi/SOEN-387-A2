package packages.businessLayer;

public class User {
    private String username;
    private String password;
    private String email;   //as per requirement 1 in section 4.2 in the assignment
    private int userID;

//    public User(String username, String password, String email) {
//        this.username = username;
//        this.password = password;
////        this.email = email;  //hardcoded email since signing up functionality is not implemented.
//        this.email = "test@gmail.com";  //hardcoded email since signing up functionality is not implemented.
//    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.email = "test@gmail.com";  //hardcoded email since signing up functionality is not implemented.
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setUserID(int id) {
        this.userID = id;
    }

    public int getUserID() {
        return this.userID;
    }
}