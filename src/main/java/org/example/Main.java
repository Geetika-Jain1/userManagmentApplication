package org.example;

public class Main {
    public static void main(String[] args) {

        UserList userList = new UserList();

        //Adding users
        userList.addUser(new User(1,"Geetika" , "geetika332@gmail.com"));
        userList.addUser(new User(2,"Nitin" , "nitin.6@gmail.com"));
        userList.addUser(new User(3,"Aawan", "aawan.4@gmail.com"));
        userList.addUser(new User(4,"Charu","charu14@gmail.com"));


        //Display unsorted list of users
        System.out.println("Original user list is :");
        userList.displayUsers();


        //Sort user by name
        userList.sortUsersByName();

        //Display sorted users
        System.out.println("\nArranged list according to alphabetical order is :");
        userList.displayUsers();


        User user = userList.getUserById(3);
        if(user != null){
            System.out.println("\nDisplaying User with Id 3 : " + user);
        }else{
            System.out.println("User not found.");

        }

        //Remove user by ID.
        userList.removeUser(4);
        System.out.println("\nAfter removing user with id :" + 4);
        userList.displayUsers();



    }
}


