import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String csvData = "name,age,city\nJohn,30,New York\nJane,25,Los Angeles\n";

            CSVHandler csvHandler = new CSVHandler(csvData);
            DataAnalyzer analyzer = new DataAnalyzer();

            analyzer.populateMap(csvHandler.getRecords());
            int johnsAge = analyzer.getAge("John");
            System.out.println("John's age is: " + johnsAge);

            CSVRecord firstRecord = csvHandler.getFirstRecord();
            /* read */ boolean isSet = firstRecord.isSet(0);
            System.out.println("Is column index 0 set? " + isSet);

            analyzer.printAges();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}