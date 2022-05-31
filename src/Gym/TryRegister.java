package Gym;

import java.util.ArrayList;

public class TryRegister implements UsersInformation {

    private static ArrayList<Users> arrayList = new ArrayList<>();

    public boolean isLogin(String userName,String password) {
        boolean flag = false;

        for (Users user: arrayList ) {

            if (user.getName().equals(userName) && user.getPassword().equals(password)) {
                flag = true;
            }
        }
        return flag;
    }

    public void register (Users users) {
        arrayList.add(users);

    }

}
