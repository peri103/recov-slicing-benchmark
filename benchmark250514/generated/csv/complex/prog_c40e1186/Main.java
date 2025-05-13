import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize CSVFormat with a trailing delimiter
        CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter();
        
        // Sample CSV data
        String csvData = "name,age\nJohn Doe,30\nJane Smith,25";
        
        try {
            // Parse the CSV data using the format with trailing delimiter
            CSVParser parser = CSVParser.parse(new StringReader(csvData), format);
            
            // Additional data structures for complexity
            ArrayList<String> names = new ArrayList<>();
            HashMap<String, Integer> nameAgeMap = new HashMap<>();
            
            // Iterate over the records and read a value
            for (CSVRecord record : parser) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));
                
                // Add data to the list and map
                names.add(name);
                nameAgeMap.put(name, age);
                
                // Perform calculations
                int ageSquare = age * age;
                System.out.println(name + "'s age squared is: " + ageSquare);
                
                // Use the read method
                /* read */ boolean isSet = record.isSet("name");
                System.out.println("Is 'name' set: " + isSet);
                
                // Break after the first read operation
                break;
            }
            
            // More complex operations
            for (String name : names) {
                int age = nameAgeMap.get(name);
                System.out.println("Name: " + name + ", Age: " + age);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Unrelated complex operations
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numberList.add(i * 10);
        }
        
        int sum = 0;
        for (int num : numberList) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
    }
}