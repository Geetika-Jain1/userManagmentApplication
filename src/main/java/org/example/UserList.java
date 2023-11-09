package org.example;

import java.util.ArrayList;
import java.util.Comparator;


public class UserList {
    ArrayList<User>userList = new ArrayList<>();


    public void addUser(User user) {
        userList.add(user);
    }

    public void removeUser (int id){
        userList.removeIf(user -> user.getId() == id);


    }

    public User getUserById(int id){
        for (User user : userList){
            if (user.getId() == id) {
                return user;

            }
        }
        return null; //User not found.

    }
    public void sortUsersByName(){
        userList.sort( Comparator.comparing (User::getName));

    }
    public void displayUsers(){
        for (User user : userList){
            System.out.println(user);
        }
    }
}

