import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello World");
        
        // Unrelated code to add complexity
        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        
        for (String str : list) {
            strBuilder.append(str);
        }
        
        // Perform some operations on the list
        if (!list.isEmpty()) {
            list.remove(0);
        }
        
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).length();
        }
        
        System.out.println("Sum of lengths: " + sum);
        
        // Original write-read pair
        /* write */ strBuilder.deleteFirst("Hello");
        
        // More unrelated code
        StrBuilder anotherBuilder = new StrBuilder("Java Programming");
        anotherBuilder.append(" is fun");
        
        if (anotherBuilder.contains("fun")) {
            anotherBuilder.deleteFirst("Java");
        }
        
        // Print the modified string from anotherBuilder
        System.out.println("AnotherBuilder: " + anotherBuilder.toString());
        
        // Original read operation
        /* read */ String result = strBuilder.toString();
        System.out.println(result);
        
        // Additional operations on the list
        list.add("Fourth");
        list.add("Fifth");
        
        for (String str : list) {
            System.out.println("List item: " + str);
        }
    }
}