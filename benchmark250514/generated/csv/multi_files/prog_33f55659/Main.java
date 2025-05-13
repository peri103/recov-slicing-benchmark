import org.apache.commons.csv.CSVRecord;
import java.util.List;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String csvData = "Name,Age\nJohn,30\nJane,25\n";
        CSVUtils csvUtils = new CSVUtils();

        try {
            List<CSVRecord> records = csvUtils.parseCSV(csvData);
            Student student = new Student(records);

            // Example output
            for (String name : student.getNameAgeMap().keySet()) {
                System.out.println(name + " is " + student.getNameAgeMap().get(name) + " years old.");
            }

            // Check if 'Name' is set in the first record
            boolean isSet = student.isNameSet(records.get(0));
            System.out.println("Is 'Name' set in the record? " + isSet);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}