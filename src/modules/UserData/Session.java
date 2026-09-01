package modules.UserData;

public class Session {
    public static UserData currentUser; 

    public static boolean isUserLoggedIn() {
        return currentUser != null;
    }
}
