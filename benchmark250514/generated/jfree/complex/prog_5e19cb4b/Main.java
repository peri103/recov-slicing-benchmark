import org.jfree.chart.title.TextTitle;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TextTitle textTitle = new TextTitle();
        ArrayList<String> stringList = new ArrayList<>();
        
        // Adding some elements to the list
        stringList.add("First");
        stringList.add("Second");

        // Manipulating the list
        stringList.add(1, "Inserted");
        stringList.remove("Second");
        
        // Using another instance of TextTitle
        TextTitle anotherTextTitle = new TextTitle();
        anotherTextTitle.setText("Another Title");
        String anotherValue = anotherTextTitle.getText();
        System.out.println("Another TextTitle: " + anotherValue);
        
        // Perform some operations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 natural numbers: " + sum);
        
        /* write */ textTitle.setText("Hello, World!");
        
        // More operations
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of first 3 natural numbers: " + product);
        
        // Getting the text from the original TextTitle
        /* read */ String value = textTitle.getText();
        System.out.println("TextTitle: " + value);
        
        // Final operations
        stringList.add("Final");
        for (String str : stringList) {
            System.out.println("List element: " + str);
        }
    }
}