import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello World");
        ArrayList<String> stringList = new ArrayList<>();
        
        // Perform some operations on the stringList
        stringList.add("First");
        stringList.add("Second");
        
        // Modify the StrBuilder object
        /* write */ strBuilder.setCharAt(6, 'J');
        
        // Additional operations on stringList
        stringList.add(strBuilder.toString());
        stringList.add("Third");

        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i * 10;
        }
        
        // Iterate over the list and print elements
        for (String str : stringList) {
            System.out.println(str);
        }

        // Read from the StrBuilder object
        /* read */ String result = strBuilder.toString();
        System.out.println("Modified StrBuilder: " + result);
        
        // Further operations
        StrBuilder anotherStrBuilder = new StrBuilder("Another String");
        anotherStrBuilder.append(" Extended");
        System.out.println(anotherStrBuilder.toString());
    }
}