import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder builder = new StrBuilder("Hello World");
        
        // Additional complex operations
        StrBuilder builder2 = new StrBuilder("Another String");
        builder2.append(" with more text");
        
        // Some string manipulations
        String sampleText = "Sample Text";
        int length = sampleText.length();
        char firstChar = sampleText.charAt(0);
        
        // Using the original write-read pair
        /* write */ builder.deleteAll("World");
        
        // Further operations
        StrBuilder builder3 = new StrBuilder("Yet another builder");
        builder3.append(" with appended text");
        builder2.append(" and even more");
        
        // Some calculations
        int number = 42;
        int result = number * 2;
        
        // Manipulating builder2
        builder2.insert(0, "Start: ");
        String extracted = builder2.substring(6, 12);
        
        // Read the modified builder
        /* read */ String resultString = builder.toString();
        
        // Print results
        System.out.println(resultString);
        System.out.println("First character of sampleText: " + firstChar);
        System.out.println("Length of sampleText: " + length);
        System.out.println("Extracted from builder2: " + extracted);
        System.out.println("Result of calculation: " + result);
    }
}