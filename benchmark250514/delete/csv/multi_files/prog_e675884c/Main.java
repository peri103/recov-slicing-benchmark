import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String csvData = "Name,Age,Location\nJohn,30,USA\nJane,25,UK";
        CSVHandler csvHandler = new CSVHandler(csvData);
        
        csvHandler.initializeFormat();
        
        try {
            Map<String, Integer> ageMap = csvHandler.parseCSV();
            
            int sumOfAges = 0;
            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
                sumOfAges += entry.getValue();
            }
            System.out.println("Sum of ages: " + sumOfAges);

            int averageAge = sumOfAges / ageMap.size();
            System.out.println("Average age: " + averageAge);
            
            CSVRecord firstRecord = csvHandler.getFirstRecord();
            /* read */ boolean isMapped = firstRecord.isMapped("Name");
            System.out.println("Is 'Name' mapped: " + isMapped);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}