import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize a StringWriter to capture CSV output
            StringWriter writer = new StringWriter();
            
            // Create a CSVPrinter to write CSV data
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            
            // Write a comment using CSVPrinter
            /* write */ csvPrinter.printComment("This is a comment");
            
            // Write some records to the CSVPrinter
            csvPrinter.printRecord("Alice", "Bob", "Charlie");
            csvPrinter.printRecord("Data1", "Data2", "Data3");
            
            // Flush and close the printer to finalize the output
            csvPrinter.flush();
            csvPrinter.close();
            
            // Parse the written CSV data to retrieve the comment
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();
            
            // Perform operations with the records
            ArrayList<String> names = new ArrayList<>();
            for (CSVRecord record : records) {
                for (String field : record) {
                    names.add(field);
                }
            }
            
            // Print all the names collected from the records
            for (String name : names) {
                System.out.println("Name: " + name);
            }
            
            // Retrieve the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            
            // Print the retrieved comment
            System.out.println("Comment: " + comment);
            
            // Perform more complex operations
            int sum = 0;
            for (int i = 0; i < names.size(); i++) {
                sum += names.get(i).length();
            }
            System.out.println("Total length of all names: " + sum);
            
            // More complex logic with conditions
            if (sum > 10) {
                System.out.println("The sum of lengths is greater than 10.");
            } else {
                System.out.println("The sum of lengths is 10 or less.");
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}