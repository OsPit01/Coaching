package Gym;

import java.util.HashMap;
import java.util.Map;

public class UserContainer {
    private static Map<String, String> map = new HashMap<String, String>();


    public UserContainer(String userName, String password) {
        this.map.put(userName, password);
    }

    public boolean isNameExists(String name, String password) {
        boolean flag = false;

        if (map.containsKey(name) && map.containsValue(password)) {
            flag = true;
        }
        return flag;
    }
}
