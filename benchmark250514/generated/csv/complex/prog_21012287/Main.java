import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String csvData = "# This is a comment\nname,age\nJohn,30\nDoe,25";
        
        // Initialize CSVFormat with a comment marker
        /* write */ CSVFormat csvFormat = CSVFormat.DEFAULT.withCommentMarker('#');
        
        // Parse the CSV data
        CSVParser parser = CSVParser.parse(new StringReader(csvData), csvFormat);
        
        // Create a list to store the records
        List<String> names = new ArrayList<>();
        
        // Iterate through the records
        for (CSVRecord record : parser) {
            // Check if the record is a comment
            if (record.getComment() != null) {
                /* read */ String comment = record.getComment();
                System.out.println("Comment: " + comment);
            } else {
                // Add names to the list
                names.add(record.get(0));
            }
        }
        
        // Print all names
        System.out.println("Names in CSV:");
        for (String name : names) {
            System.out.println(name);
        }
        
        // Additional logic to manipulate the list
        List<Integer> ages = new ArrayList<>();
        ages.add(30);
        ages.add(25);
        
        // Calculate and print average age
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double averageAge = sum / (double) ages.size();
        System.out.println("Average Age: " + averageAge);
        
        // Add more complexity by reversing the list of names
        List<String> reversedNames = new ArrayList<>();
        for (int i = names.size() - 1; i >= 0; i--) {
            reversedNames.add(names.get(i));
        }
        
        // Print reversed names
        System.out.println("Reversed Names:");
        for (String name : reversedNames) {
            System.out.println(name);
        }
    }
}