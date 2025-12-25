import service.UserService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Collaboration Demo Backend...");

        UserService userService = new UserService();
        userService.createUser("Shubham", "shubham@gmail.com");
    }
}
