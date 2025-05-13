import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry entry = new JarArchiveEntry("example.jar");
        /* write */ entry.setComment("This is a test comment");

        Map<String, String> metadata = new HashMap<>();
        metadata.put("Version", "1.0");
        metadata.put("Author", "John Doe");
        
        StringBuilder descriptionBuilder = new StringBuilder();
        for (Map.Entry<String, String> meta : metadata.entrySet()) {
            descriptionBuilder.append(meta.getKey()).append(": ").append(meta.getValue()).append("\n");
        }

        String description = descriptionBuilder.toString();
        System.out.println("Metadata Description:\n" + description);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // More operations
        StringBuilder reverseStringBuilder = new StringBuilder("Complexity");
        String reversedString = reverseStringBuilder.reverse().toString();
        System.out.println("Reversed String: " + reversedString);

        /* read */ String comment = entry.getComment();
        System.out.println("Jar Comment: " + comment);

        // Final operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);
    }
}