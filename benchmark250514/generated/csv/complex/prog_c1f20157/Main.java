import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT;

        // Additional unrelated initialization
        Map<String, Integer> cityPopulation = new HashMap<>();
        cityPopulation.put("New York", 8419000);
        cityPopulation.put("Los Angeles", 3980000);
        cityPopulation.put("Chicago", 2716000);

        try {
            /* write */ format = format.withHeader("Name", "Age", "City");
            CSVPrinter printer = new CSVPrinter(writer, format);

            List<String> record1 = Arrays.asList("Alice", "30", "New York");
            List<String> record2 = Arrays.asList("Bob", "25", "Los Angeles");
            printer.printRecord(record1);
            printer.printRecord(record2);

            printer.flush();
            printer.close();

            // Unrelated complex operations
            int totalPopulation = 0;
            for (String city : cityPopulation.keySet()) {
                totalPopulation += cityPopulation.get(city);
            }
            System.out.println("Total Population: " + totalPopulation);

            String csvContent = writer.toString();
            CSVRecord record = CSVFormat.DEFAULT.withHeader("Name", "Age", "City").parse(new StringReader(csvContent)).getRecords().get(0);

            // More unrelated operations
            Map<String, String> personInfo = new HashMap<>();
            personInfo.put("Name", record.get("Name"));
            personInfo.put("Age", record.get("Age"));
            personInfo.put("City", record.get("City"));

            for (Map.Entry<String, String> entry : personInfo.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            /* read */ boolean isSet = record.isSet("Name");
            System.out.println("Is 'Name' set? " + isSet); // Should print true as "Name" header was set and used
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}