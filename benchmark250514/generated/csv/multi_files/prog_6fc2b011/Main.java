import java.io.IOException;
import java.util.List;
import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        try {
            CSVDataHandler dataHandler = new CSVDataHandler();
            String csvData = "name,age\nJohn,30\n\nJane,25";
            List<CSVRecord> records = dataHandler.parseCSVData(csvData);

            CSVRecordAnalyzer analyzer = new CSVRecordAnalyzer(records);
            analyzer.analyzeRecords();
            analyzer.printNames();

            double averageAge = analyzer.calculateAverageAge();
            System.out.println("Average Age: " + averageAge);

            boolean isConsistent = analyzer.isFirstRecordConsistent();
            System.out.println("Is the first record consistent? " + isConsistent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}