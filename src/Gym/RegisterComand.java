package Gym;

import java.util.ArrayList;
import java.util.Arrays;

public class RegisterComand
{
    ArrayList<UserContainer> userContainerArraysList = new ArrayList<>();


    public void register (UserContainer user) {
        userContainerArraysList.add(user);

    }
}
