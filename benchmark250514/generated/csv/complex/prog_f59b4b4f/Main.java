import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        String csvData = "name,age,city\nJohn,30,New York\nDoe,40,Los Angeles";
        
        CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader(); /* write */
        List<CSVRecord> records = format.parse(new StringReader(csvData)).getRecords();
        
        List<String> names = new ArrayList<>();
        List<Integer> ages = new ArrayList<>();
        List<String> cities = new ArrayList<>();
        
        for (CSVRecord record : records) {
            names.add(record.get("name"));
            ages.add(Integer.parseInt(record.get("age")));
            cities.add(record.get("city"));
        }
        
        CSVRecord firstRecord = records.get(0);
        boolean isMapped = firstRecord.isMapped("name"); /* read */
        
        System.out.println("Is 'name' mapped? " + isMapped);
        
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Name: " + names.get(i) + ", Age: " + ages.get(i) + ", City: " + cities.get(i));
        }
        
        // Additional complex operations
        int totalAge = 0;
        for (int age : ages) {
            totalAge += age;
        }
        
        System.out.println("Total Age: " + totalAge);
        
        String longestCityName = "";
        for (String city : cities) {
            if (city.length() > longestCityName.length()) {
                longestCityName = city;
            }
        }
        
        System.out.println("Longest City Name: " + longestCityName);
    }
}