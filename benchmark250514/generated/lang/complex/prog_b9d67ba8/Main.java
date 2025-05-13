import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello World!");
        
        // Additional operations to make the program more complex
        StrBuilder anotherStrBuilder = new StrBuilder("Goodbye");
        anotherStrBuilder.append(" Moon!");

        // Manipulating another StrBuilder object
        anotherStrBuilder.insert(8, "Beautiful ");
        System.out.println(anotherStrBuilder.toString());

        // Performing some arithmetic calculations
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Loop to demonstrate more complexity
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop iteration: " + i);
        }

        /* write */ strBuilder.setLength(5);

        // More string manipulations
        StringBuilder stringBuilder = new StringBuilder("Complexity");
        stringBuilder.reverse();
        System.out.println("Reversed: " + stringBuilder);

        // Using the original StrBuilder in a different way
        strBuilder.append(" Universe");
        System.out.println("Appended: " + strBuilder.toString());

        /* read */ String result = strBuilder.toString();

        System.out.println(result);
    }
}