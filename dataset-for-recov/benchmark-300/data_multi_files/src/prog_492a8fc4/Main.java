import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        User user = new User("JohnDoe");
        
        // Adding some data to the user's DataManager
        user.addData("initialData");
        
        // Creating and populating a HashSet
        Set<Integer> numbers = new HashSet<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        
        // Iterating through the HashSet and printing elements
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
        
        // Checking if the user's DataManager contains the added data
        /* read */ boolean containsData = user.getDataSet().contains("initialData");
        System.out.println("Contains 'initialData': " + containsData);
        
        // Adding more data to the user's DataManager
        user.addData("additionalData");
        user.addData("moreData");
        
        // Iterating through the user's DataManager and printing elements
        for (String data : user.getDataSet()) {
            System.out.println("Data: " + data);
        }
    }
}