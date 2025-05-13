import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrBuilder object
        StrBuilder strBuilder = new StrBuilder("Hello, World!");

        // Create a list of StrBuilder objects
        List<StrBuilder> strBuilderList = new ArrayList<>();
        strBuilderList.add(new StrBuilder("First"));
        strBuilderList.add(new StrBuilder("Second"));
        strBuilderList.add(new StrBuilder("Third"));

        // Use the substring method on the original strBuilder
        /* write */ strBuilder.substring(0, 5);

        // Modify and print each StrBuilder in the list
        for (StrBuilder sb : strBuilderList) {
            sb.append(" Element");
            System.out.println(sb.toString());
        }

        // Perform some unrelated computations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // Use the toString method to read the value from the original strBuilder
        /* read */ String value = strBuilder.toString();

        // Print the value
        System.out.println(value);

        // Further manipulate the strBuilderList
        for (int i = 0; i < strBuilderList.size(); i++) {
            strBuilderList.get(i).insert(0, "Modified ");
            System.out.println(strBuilderList.get(i).toString());
        }
    }
}