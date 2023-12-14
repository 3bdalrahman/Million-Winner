package millionwinner;

public class UserSession {
    private static UserSession instance;
    private User currentUser;

    private UserSession() {
    }
    
    public static UserSession getInsance(){
        if(instance==null){
            instance=new UserSession();
        }
        return instance;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
    
}
