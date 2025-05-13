import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            CSVParser csvParser = new CSVParser();
            List<CSVRecord> records = csvParser.parseCSV("Header1,Header2\nvalue1,value2");

            DataStructures dataStructures = new DataStructures();
            dataStructures.displayListItems();
            dataStructures.displayMapItems();

            if (!records.isEmpty()) {
                CSVRecord record = records.get(0);

                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                }
                System.out.println("Sum of first 10 natural numbers: " + sum);

                /* read */ boolean isMapped = record.isMapped("HEADER1");
                System.out.println("Is 'HEADER1' mapped: " + isMapped);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}