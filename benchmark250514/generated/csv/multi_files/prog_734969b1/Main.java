import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String csvContent = "name,age\nJohn,NULL\nDoe,25";
            CSVHandler csvHandler = new CSVHandler(csvContent);
            RecordAnalyzer analyzer = new RecordAnalyzer(csvHandler.getRecordsList());

            boolean isAgeSet = analyzer.isAgeSetInFirstRecord();
            System.out.println("Is 'age' set in the first record? " + isAgeSet);

            analyzer.printRecords();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}