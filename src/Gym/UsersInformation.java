package Gym;

public interface UsersInformation {

    // выполнил пользователь вход??

    public abstract boolean isLogin(String userName, String password);

    //  регистрация пользователя

    public abstract void register(Users users);
}


