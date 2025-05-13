import org.apache.commons.csv.CSVRecord;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CSVHandler csvHandler = new CSVHandler();
        csvHandler.configureFormat();

        String csvData = "name;age;city\nJohn Doe;30;New York\nJane Smith;25;Los Angeles";
        csvHandler.parseCSV(csvData);

        List<CSVRecord> records = csvHandler.getRecords();
        for (CSVRecord record : records) {
            String name = record.get(0);
            int age = Integer.parseInt(record.get(1));
            String city = record.get(2);

            Student student = new Student(name, age, city);
            System.out.println("Created Student: " + student);

            if (name.equals("John Doe")) {
                /* read */ String recordString = record.toString();
                System.out.println("CSV Record String: " + recordString);
            }
        }
    }
}