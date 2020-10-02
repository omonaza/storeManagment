package backEnd.domain.users;

public class adminUser extends user {

    public adminUser(String username, String password, String email, String name) {
        super(username, password, email, name);
    }

    public boolean userMatches(String username, String password) {
        return getUsername().equals(username)&&getPassword().equals(password);
    }

    @Override
    public String toString(){
        return "adminUser" +super.toString();
    }
}
