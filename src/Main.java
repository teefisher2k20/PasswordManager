// main method to run the application


public class Main {
    public static void main(String[] args) {
        //loading screen class
        new SplashScreen();
        try {
            new PasswordManager();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}