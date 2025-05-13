import org.apache.commons.lang3.text.StrBuilder;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello World!");
        
        // Additional operations on StrBuilder
        strBuilder.append(" How are you?");
        strBuilder.insert(0, "Greetings! ");
        
        // Using StringUtils for additional complexity
        String reversedString = StringUtils.reverse(strBuilder.toString());
        System.out.println("Reversed: " + reversedString);
        
        // Manipulating the StrBuilder further
        strBuilder.replaceFirst("World", "Universe");
        
        // Original write-read pair
        /* write */ strBuilder.deleteFirst("Hello ");
        
        // More operations before the read
        int length = strBuilder.length();
        System.out.println("Length before read: " + length);
        
        // Splitting string into an array for complexity
        String[] words = strBuilder.toString().split(" ");
        for (String word : words) {
            System.out.println("Word: " + word);
        }
        
        // Original read operation
        /* read */ String result = strBuilder.toString();
        System.out.println("Final Result: " + result);
        
        // Further manipulation and output
        StrBuilder anotherBuilder = new StrBuilder("This is another builder.");
        anotherBuilder.append(" It has more text.");
        System.out.println("Another Builder: " + anotherBuilder.toString());
    }
}