import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        User user = new User("JohnDoe");
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        // Add some random numbers to the list
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        // Print the list
        System.out.println("Random numbers in the list:");
        for (Integer num : list) {
            System.out.println(num);
        }

        // Write operation
        user.storeData("testValue");

        // Perform some operations on the list
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        System.out.println("Sum of the numbers in the list: " + sum);

        // Read operation
        /* read */ boolean containsValue = user.checkData("testValue");
        System.out.println("User's storage contains 'testValue': " + containsValue);

        // Add more elements to the user's storage
        for (int i = 0; i < 5; i++) {
            user.storeData("value" + i);
        }

        // Check and print all elements in the user's storage
        System.out.println("Elements in the user's storage:");
        for (int i = 0; i < 5; i++) {
            if (user.checkData("value" + i)) {
                System.out.println("value" + i);
            }
        }
    }
}