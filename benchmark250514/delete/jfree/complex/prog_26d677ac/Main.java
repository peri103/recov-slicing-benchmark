import org.jfree.chart.title.Title;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a Title object and set its text
        Title title = new Title();
        
        // Unrelated code to add complexity
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("First");
        stringList.add("Second");
        
        for (String str : stringList) {
            System.out.println("String from list: " + str);
        }
        
        // Setting text for the Title object
        /* write */ title.setText("Chart Title");
        
        // More unrelated code to add complexity
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Read the text from the Title object
        /* read */ String value = title.getText();
        
        System.out.println("Title text: " + value);
        
        // Additional code to demonstrate usage of another class
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 2);
        }
        
        for (Integer number : numberList) {
            System.out.println("Number from list: " + number);
        }
    }
}