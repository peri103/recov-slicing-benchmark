import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.append("Hello, World!");

        // Create and manipulate a list
        List<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        System.out.println("List before modification: " + list);

        // Perform some operations on the list
        list.remove(1);
        list.add("New Item");
        System.out.println("List after modification: " + list);

        /* write */ strBuilder.clear();

        // Use StringBuilder for additional operations
        StringBuilder extraBuilder = new StringBuilder();
        extraBuilder.append("Extra content");
        extraBuilder.append(" appended.");
        System.out.println(extraBuilder.toString());

        // Conditional logic
        int number = 5;
        if (number > 3) {
            System.out.println("Number is greater than 3");
        } else {
            System.out.println("Number is not greater than 3");
        }

        /* read */ String value = strBuilder.toString();
        System.out.println("StrBuilder content after clear: " + value);
    }
}