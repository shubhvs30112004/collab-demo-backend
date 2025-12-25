package service;

import model.User;

public class UserService {

    public void createUser(String name, String email) {

        if (name == null || name.isEmpty()) {
            System.out.println("User name cannot be empty");
            return;
        }

        if (email == null || !email.contains("@")) {
            System.out.println("Invalid email address");
            return;
        }

        User user = new User(name, email);
        System.out.println("User created:");
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
    }
}
