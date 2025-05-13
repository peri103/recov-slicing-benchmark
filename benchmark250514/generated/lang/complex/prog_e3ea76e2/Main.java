import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.append("Hello");
        /* write */ strBuilder.appendSeparator(", ");
        strBuilder.append("World");
        
        // Additional code to increase complexity
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        
        StrBuilder languagesBuilder = new StrBuilder();
        for (String language : list) {
            languagesBuilder.append(language).appendSeparator(" | ");
        }
        
        // Some operations on the list
        list.add("JavaScript");
        list.remove("C++");
        
        // Manipulating the StrBuilder further
        strBuilder.append("!");
        strBuilder.insert(0, "Greetings: ");
        
        // Using StrBuilder to reverse a string
        StrBuilder reverseBuilder = new StrBuilder("Reverse");
        reverseBuilder.reverse();
        System.out.println("Reversed: " + reverseBuilder.toString());
        
        // Finalizing the original StrBuilder
        /* read */ String result = strBuilder.toString();
        System.out.println(result);
        
        // Outputting the concatenated languages
        System.out.println("Languages: " + languagesBuilder.toString());
    }
}