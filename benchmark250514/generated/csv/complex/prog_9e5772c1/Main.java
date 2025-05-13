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
            // Initialize CSVFormat with header comments
            CSVFormat format = CSVFormat.DEFAULT /* write */.withHeaderComments("This is a comment");

            // Prepare to write to a CSV string
            StringWriter writer = new StringWriter();
            CSVPrinter printer = new CSVPrinter(writer, format);

            // Write a sample record
            printer.printRecord("Column1", "Column2");

            // Close the printer
            printer.close();

            // Create a list of CSV records
            List<CSVRecord> records = CSVFormat.DEFAULT.parse(new java.io.StringReader(writer.toString())).getRecords();

            // Add complexity by manipulating the records list
            ArrayList<String> columnData = new ArrayList<>();
            for (CSVRecord record : records) {
                columnData.add(record.get(0));
            }

            // Add more data to the list
            columnData.add("Additional Data");

            // Perform some operations on the list
            for (int i = 0; i < columnData.size(); i++) {
                System.out.println("Data at index " + i + ": " + columnData.get(i));
            }

            // Assuming we read the first record
            CSVRecord record = records.get(0);

            // Retrieve the comment from the record
            /* read */ String comment = record.getComment();

            // Print the comment
            System.out.println("Comment: " + comment);

            // Further manipulate the list
            columnData.remove("Additional Data");
            columnData.add("Final Data");

            // Print final list data
            for (String data : columnData) {
                System.out.println("Final Data: " + data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}