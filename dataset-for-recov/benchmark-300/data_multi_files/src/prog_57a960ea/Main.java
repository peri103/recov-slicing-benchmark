import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alice");
        user.sendMessage("Hello, World!");
        
        // Adding some unrelated operations to make the program more complex
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Performing the original read operation
        /* read */ String lastMessage = user.getLastMessage();
        System.out.println("Last message: " + lastMessage);
        
        // Additional complexity: creating another user
        User anotherUser = new User("Bob");
        anotherUser.sendMessage("Hi there!");
        System.out.println("Bob's last message: " + anotherUser.getLastMessage());
    }
}