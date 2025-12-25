package service;

import model.User;

public class UserService {

    public void createUser(String name, String email) {
        User user = new User(name, email);
        System.out.println("User created:");
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
    }
}
