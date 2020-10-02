package backEnd.domain.users;

public class buyerUser  extends user{

    public buyerUser(String username, String password, String email, String name) {
        super(username, password, email, name);
    }

    public boolean userMatches(String username, String password) {
        return getUsername().equals(username)&& getPassword().equals(password);
    }
    @Override
    public String toString(){
        return "buyerUser" +super.toString();
    }
}
