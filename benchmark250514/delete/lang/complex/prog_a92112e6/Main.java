import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello World");

        // Additional complex operations
        StrBuilder anotherStrBuilder = new StrBuilder("Additional ");
        anotherStrBuilder.append("Complexity");
        System.out.println("Another StrBuilder content: " + anotherStrBuilder.toString());

        // Manipulate the original StrBuilder
        strBuilder.append(" - Java Programming");
        System.out.println("After appending: " + strBuilder.toString());

        // Insert some characters
        strBuilder.insert(5, ",");
        System.out.println("After insertion: " + strBuilder.toString());

        // Replace a portion of the string
        strBuilder.replace(0, 5, "Hi");
        System.out.println("After replacement: " + strBuilder.toString());

        // Perform the write operation
        /* write */ strBuilder.setCharAt(6, 'W');

        // More unrelated operations
        StrBuilder reversedStrBuilder = new StrBuilder(strBuilder).reverse();
        System.out.println("Reversed StrBuilder: " + reversedStrBuilder.toString());

        // Perform the read operation
        /* read */ String result = strBuilder.toString();
        System.out.println("Final result: " + result);

        // Additional complexity: calculate length and capacity
        System.out.println("Length: " + strBuilder.length());
        System.out.println("Capacity: " + strBuilder.capacity());
    }
}