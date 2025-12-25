import service.UserService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Collaboration Demo Backend...");

        UserService userService = new UserService();
        boolean isUserCreated = userService.createUser("Shubham", "shubham@gmail.com");

        if (isUserCreated) {
            System.out.println("User created successfully.");
        } else {
            System.out.println("Failed to create user.");
        }

    }
}
