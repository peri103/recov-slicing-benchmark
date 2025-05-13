import org.apache.commons.lang3.text.StrBuilder;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder();
        StrBuilder additionalBuilder = new StrBuilder();
        
        // Initialize additionalBuilder with some text
        additionalBuilder.append("Apache Commons Lang ");
        additionalBuilder.append("is a library that ");
        additionalBuilder.append("provides extra functionality.");

        // Perform some operations with additionalBuilder
        if (StringUtils.contains(additionalBuilder, "library")) {
            additionalBuilder.replaceFirst("library", "Java library");
        }

        // Some unrelated operations
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // More operations
        StrBuilder complexBuilder = new StrBuilder();
        complexBuilder.append(additionalBuilder);
        complexBuilder.append(" It is very useful.");
        
        // Original write operation
        /* write */ strBuilder.setNewLineText("Hello, World!");

        // Perform operations with complexBuilder
        if (complexBuilder.length() > 50) {
            complexBuilder.delete(50, complexBuilder.length());
        }
        System.out.println(complexBuilder.toString());

        // Original read operation
        /* read */ String value = strBuilder.toString();
        System.out.println(value);

        // Additional operations with strBuilder
        strBuilder.append(" This is the end of the example.");
        System.out.println(strBuilder.toString());
    }
}