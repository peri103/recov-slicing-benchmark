import org.apache.commons.csv.CSVRecord;
import java.io.StringReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CSVConfiguration config = new CSVConfiguration();
        config.configure();

        String csvData = "name,age\nJohn Doe,30\nJane Doe,25";
        List<CSVRecord> records = null;
        try {
            records = config.getFormat().parse(new StringReader(csvData)).getRecords();
        } catch (Exception e) {
            e.printStackTrace();
        }

        CSVDataParser parser = new CSVDataParser(records);
        parser.displayData();

        boolean isNameSet = parser.isNameSetForFirstRecord();
        System.out.println("Is 'name' set for the first record: " + isNameSet);

        double averageAge = parser.calculateAverageAge();
        System.out.println("Average Age: " + averageAge);
    }
}