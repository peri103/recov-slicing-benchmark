import org.jfree.chart.title.Title;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize Title object
        Title title = new Title();
        
        // Initialize an ArrayList to demonstrate additional complexity
        ArrayList<String> strings = new ArrayList<>();
        strings.add("String1");
        strings.add("String2");
        
        // Manipulate the ArrayList
        for (int i = 0; i < strings.size(); i++) {
            System.out.println("Processing: " + strings.get(i));
            strings.set(i, strings.get(i).toUpperCase());
        }
        
        // Write to the Title object
        /* write */ title.setText("Hello World");
        
        // Further manipulate the ArrayList
        for (String str : strings) {
            System.out.println("Modified: " + str);
        }
        
        // Perform some calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        
        // Read from the Title object
        /* read */ String text = title.getText();
        System.out.println("Title text: " + text);
        
        // More operations on the ArrayList
        strings.add("String3");
        strings.remove(0);
        
        // Display final state of the ArrayList
        System.out.println("Final ArrayList contents:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}