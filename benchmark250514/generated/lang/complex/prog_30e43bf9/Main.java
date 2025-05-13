import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello, World!");
        StrBuilder anotherBuilder = new StrBuilder("This is another StrBuilder.");
        
        // Adding more complexity by manipulating another StrBuilder
        anotherBuilder.append(" Let's add some more text.");
        System.out.println("AnotherBuilder content: " + anotherBuilder.toString());
        
        // Perform some operations on strBuilder before clearing
        strBuilder.append(" This text will be cleared.");
        System.out.println("Before clear: " + strBuilder.toString());
        
        /* write */ strBuilder.clear();
        
        // Perform operations on anotherBuilder after clearing strBuilder
        anotherBuilder.append(" More text after clearing strBuilder.");
        System.out.println("AnotherBuilder content after strBuilder clear: " + anotherBuilder.toString());
        
        // More operations on strBuilder
        strBuilder.append("New content after clearing.");
        strBuilder.insert(0, "Inserted at start. ");
        
        // Perform a loop to simulate complexity
        for (int i = 0; i < 5; i++) {
            strBuilder.append(" Loop iteration: ").append(i);
        }
        
        // Final read operation
        /* read */ String value = strBuilder.toString();
        System.out.println("Final strBuilder content: " + value);
        
        // Additional operations on anotherBuilder
        anotherBuilder.reverse();
        System.out.println("Reversed anotherBuilder: " + anotherBuilder.toString());
        
        // Simulate some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
    }
}