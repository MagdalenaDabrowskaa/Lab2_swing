import java.util.HashMap;
import java.util.Map;

public class BaseOfUsers {

    HashMap<String,String> users = new HashMap<String,String>();

    BaseOfUsers()
    {
        users.put("Kasia", "haslo");  
    }

    protected HashMap getUsers(){
        return users;
    }


}
