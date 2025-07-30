package jul29;

public class UserAppMain {
    public static void main(String[] args) {

        UserLogin userLogin = new UserLogin("Pragra","pragra123");
        userLogin.loginUser("Pragra", "pragra123s");

        // hacker
        userLogin.setPassword("mypassword");
        System.out.println(userLogin.getUserName());

        userLogin.loginUser("test","mypassword");



        //gmail
        // forget password : email , reset password

        // instagram : username

    }
}
