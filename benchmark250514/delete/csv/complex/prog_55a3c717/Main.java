import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a CSVFormat object and configure it using the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withIgnoreHeaderCase();

        // Simulate a CSVRecord with headers to test the read method
        List<String> headers = Arrays.asList("Name", "Age", "Location");
        List<String> values = Arrays.asList("John Doe", "30", "New York");
        CSVRecord record = new CSVRecord(null, values, headers, 0, values.size());

        // Additional complexity: Using a HashMap to store some data
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("John Doe", 30);
        ageMap.put("Jane Smith", 25);

        // Perform some operations on the map
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

        // Another CSVRecord with different data
        List<String> headers2 = Arrays.asList("Product", "Price", "Quantity");
        List<String> values2 = Arrays.asList("Laptop", "1000", "5");
        CSVRecord record2 = new CSVRecord(null, values2, headers2, 0, values2.size());

        // Check if a field is mapped in the second record
        boolean isProductMapped = record2.isMapped("Product");
        System.out.println("Is 'Product' mapped in record2? " + isProductMapped);

        // Use the read method to check if the field is mapped in the original record
        /* read */ boolean isMapped = record.isMapped("name");
        System.out.println("Is 'name' mapped in record? " + isMapped);

        // Additional operation: Calculate total price from the second record
        int price = Integer.parseInt(record2.get("Price"));
        int quantity = Integer.parseInt(record2.get("Quantity"));
        int totalPrice = price * quantity;
        System.out.println("Total Price for " + record2.get("Product") + ": " + totalPrice);
    }
}