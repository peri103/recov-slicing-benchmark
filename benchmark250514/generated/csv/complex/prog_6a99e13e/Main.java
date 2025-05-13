import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV format with comment marker
            /* write */ CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
            
            // Prepare a CSV string with comments
            String csvData = "# This is a comment\nheader1,header2\nvalue1,value2";
            
            // Parse the CSV data
            CSVParser parser = new CSVParser(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Create a new CSV data
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("name", "age"));
            
            // Add some records to the new CSV data
            printer.printRecord("Alice", 30);
            printer.printRecord("Bob", 25);
            printer.printRecord("Charlie", 35);
            
            // Convert the written CSV data to a string
            String newCsvData = writer.toString();
            
            // Parse the new CSV data
            CSVParser newParser = new CSVParser(new StringReader(newCsvData), CSVFormat.DEFAULT.withHeader());
            List<CSVRecord> newRecords = newParser.getRecords();
            
            // Process each record and print the name and age
            for (CSVRecord record : newRecords) {
                String name = record.get("name");
                String age = record.get("age");
                System.out.println("Name: " + name + ", Age: " + age);
            }
            
            // Retrieve the comment from the first record
            /* read */ String comment = records.get(0).getComment();
            
            // Print the comment
            System.out.println("Comment: " + comment);
            
            // Close resources
            parser.close();
            newParser.close();
            printer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}