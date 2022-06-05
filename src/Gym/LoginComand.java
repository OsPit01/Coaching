package Gym;

public class LoginComand {

    public boolean isLogin(String userName, String password) {

        boolean flag = false;
        RegisterComand comand = new RegisterComand();
        for (UserContainer user : comand.userContainerArraysList) {

            if (user.getName().equals(userName) && user.getPassword().equals(password)) {
                flag = true;
            }
        }
        return flag;
    }
}
