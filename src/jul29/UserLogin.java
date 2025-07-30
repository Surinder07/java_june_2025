package jul29;

public class UserLogin {
    private String userName;
    private String password;

    public UserLogin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    // get the username
    public String getUserName() {
        return userName;
    }

    // set the new password
    public void setPassword(String password) {
        this.password = password;
    }

    public void loginUser(String userName, String password){
        if(this.userName.equals(userName) && this.password.equals(password)){
            System.out.println("user is authenticated");
            System.out.println("Welcome to My App");
        }else {
            System.err.println("Invalid credentials, Please try again!!!");
        }
    }
}
