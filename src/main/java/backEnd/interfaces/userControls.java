package backEnd.interfaces;

import backEnd.domain.producs.product;
import backEnd.domain.users.user;

import java.util.ArrayList;

public interface userControls {
    public void register(user user);
    public boolean login(String username, String password);

}
