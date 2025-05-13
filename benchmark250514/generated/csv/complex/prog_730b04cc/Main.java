import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with the write method
        CSVFormat format = CSVFormat.DEFAULT;
        /* write */ format = format.withNullString("NULL");

        String csvData = "name,age\nJohn,NULL\nDoe,30";
        try {
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            List<CSVRecord> records = parser.getRecords();
            
            // Perform some unrelated operations
            int sumOfAges = 0;
            for (CSVRecord record : records) {
                String ageString = record.get("age");
                if (!"NULL".equals(ageString)) {
                    sumOfAges += Integer.parseInt(ageString);
                }
            }
            System.out.println("Sum of ages: " + sumOfAges);
            
            // Access the first record
            CSVRecord firstRecord = records.get(0);
            
            // Perform another unrelated operation
            String firstName = firstRecord.get("name");
            System.out.println("First name in the first record: " + firstName);
            
            // Use the read method
            /* read */ boolean isSet = firstRecord.isSet("age");
            System.out.println("Is 'age' set in the first record: " + isSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Additional unrelated operations
        String extraCsvData = "product,price\nLaptop,1000\nPhone,NULL";
        try {
            CSVParser extraParser = CSVParser.parse(new StringReader(extraCsvData), format);
            List<CSVRecord> extraRecords = extraParser.getRecords();
            
            for (CSVRecord extraRecord : extraRecords) {
                String product = extraRecord.get("product");
                String priceString = extraRecord.get("price");
                if ("NULL".equals(priceString)) {
                    System.out.println(product + " has no price set.");
                } else {
                    System.out.println(product + " costs " + priceString);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}