import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alice");
        ArrayList<String> messages = new ArrayList<>();
        LinkedList<Integer> numbers = new LinkedList<>();

        // Adding messages to the ArrayList
        messages.add("Hi there!");
        messages.add("How are you?");

        // Adding numbers to the LinkedList
        numbers.add(10);
        numbers.add(20);

        // Sending a message
        user.sendMessage("Hello, Bob!");

        // Iterating through the messages and sending them
        for (String message : messages) {
            user.sendMessage(message);
        }

        // Iterating through the numbers and sending them as messages
        for (Integer number : numbers) {
            user.sendMessage(number.toString());
        }

        // Performing some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Receiving the first message
        /* read */ String message = user.receiveMessage();
        System.out.println("First message received: " + message);

        // Printing all messages
        System.out.println("All messages:");
        for (String msg : user.messageQueue.getQueue()) {
            System.out.println(msg);
        }
    }
}