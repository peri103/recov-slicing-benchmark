import org.apache.commons.csv.CSVRecord;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a CSVConfiguration and enable trimming
        CSVConfiguration csvConfig = new CSVConfiguration();
        csvConfig.enableTrimming();

        // Create a CSVRecord for demonstration
        String[] headers = {"Name", "Age", "Country"};
        String[] values = {"John", "30", "USA"};
        CSVRecord record = new CSVRecord(null, values, headers, null, null, 0, 0, 0);

        // Create CSVData object and check if fields are mapped
        CSVData csvData = new CSVData(record);
        boolean isNameMapped = csvData.isFieldMapped("Name");
        System.out.println("Is 'Name' mapped: " + isNameMapped);

        // Create a Student object
        Student student = new Student(csvData.getField("Name"), Integer.parseInt(csvData.getField("Age")), csvData.getField("Country"));
        System.out.println("Student Info: " + student.getName() + ", Age: " + student.getAge() + ", Country: " + student.getCountry());

        // Demonstrate using a HashMap for unrelated operations
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put(student.getName(), student.getAge());
        
        // Print all ages from the map
        for (String name : ageMap.keySet()) {
            System.out.println(name + "'s age is " + ageMap.get(name));
        }
    }
}