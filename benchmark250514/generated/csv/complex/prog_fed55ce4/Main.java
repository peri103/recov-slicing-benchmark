import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.csv.CSVParser;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the CSV format with trimming enabled
        /* write */ CSVFormat format = CSVFormat.DEFAULT.withTrim();

        // Sample CSV data
        String csvData = "name,email,age\nJohn Doe,john.doe@example.com,30\nJane Doe,jane.doe@example.com,25";

        try {
            // Parse the CSV data
            Reader reader = new StringReader(csvData);
            CSVParser parser = new CSVParser(reader, format);
            List<CSVRecord> records = parser.getRecords();

            // Additional unrelated code to increase complexity
            ArrayList<HashMap<String, String>> userList = new ArrayList<>();

            for (CSVRecord record : records) {
                HashMap<String, String> userMap = new HashMap<>();
                userMap.put("name", record.get("name"));
                userMap.put("email", record.get("email"));
                userMap.put("age", record.get("age"));
                userList.add(userMap);
            }

            // Process the list of users
            for (HashMap<String, String> user : userList) {
                System.out.println("Processing user: " + user.get("name"));
            }

            // Read the first record and check if a field is mapped
            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isMapped = firstRecord.isMapped("name");
            System.out.println("Is 'name' mapped: " + isMapped);

            // Additional operations on the user data
            for (HashMap<String, String> user : userList) {
                int age = Integer.parseInt(user.get("age"));
                if (age > 20) {
                    System.out.println(user.get("name") + " is older than 20.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}