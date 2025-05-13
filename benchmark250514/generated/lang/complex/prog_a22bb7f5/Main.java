import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder();
        
        // Additional code to make the program more complex
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Initial String.");
        
        for (int i = 0; i < 5; i++) {
            stringBuilder.append(" Adding more text.");
        }
        
        System.out.println("StringBuilder content: " + stringBuilder.toString());
        
        // Original write operation
        /* write */ strBuilder.insert(0, "Hello, World!");
        
        // More operations on strBuilder
        strBuilder.append(" Welcome to the complex program.");
        strBuilder.append(" Let's do some text manipulation.");
        
        for (int i = 0; i < 3; i++) {
            strBuilder.insert(strBuilder.length() / 2, " Inserted text.");
        }
        
        // Unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        
        // Original read operation
        /* read */ String value = strBuilder.toString();
        System.out.println(value);
        
        // More operations to increase complexity
        String reverse = new StringBuilder(value).reverse().toString();
        System.out.println("Reversed string: " + reverse);
        
        int count = 0;
        for (char c : value.toCharArray()) {
            if (c == 'e') {
                count++;
            }
        }
        System.out.println("Number of 'e' characters: " + count);
    }
}