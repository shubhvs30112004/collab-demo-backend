package service;

import model.User;

public class UserService {

    public boolean createUser(String name, String email) {

        //validating users
        if (!isValid(name, email)) {
            return false;
        }

        User user = new User(name, email);
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("User created successfully!!!:");

        return true;
    }

    //validation function
    private boolean isValid(String name, String email) {

        // Basic validation checks
        if (name == null || name.isEmpty()) {
            System.out.println("User name cannot be empty");
            return false;
        }

        if (email == null || !email.contains("@")) {
            System.out.println("Invalid email address");
            return false;
        }

        // TODO: Add regex-based email validation
        return true;
    }
}
