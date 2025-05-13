import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        // Initial StrBuilder object
        StrBuilder strBuilder = new StrBuilder("Hello World");
        
        // Another StrBuilder operation
        StrBuilder anotherStrBuilder = new StrBuilder("Example");
        anotherStrBuilder.setCharAt(0, 'S');
        System.out.println(anotherStrBuilder.toString());

        // Some arbitrary calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Manipulate the original StrBuilder
        /* write */ strBuilder.setCharAt(0, 'Y');

        // More operations on another StrBuilder
        anotherStrBuilder.append(" StringBuilder");
        System.out.println(anotherStrBuilder.toString());

        // Some more arbitrary logic
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);

        // Finally read the modified StrBuilder
        /* read */ String result = strBuilder.toString();
        System.out.println("Modified StrBuilder: " + result);
    }
}