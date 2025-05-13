import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            String csvData = "name,age\nJohn,30\nJane,25";
            CSVUtils csvUtils = new CSVUtils(csvData);
            StudentManager studentManager = new StudentManager();

            List<CSVRecord> records = csvUtils.getRecords();
            studentManager.loadStudents(records);

            for (Student student : studentManager.getStudents()) {
                System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
            }

            CSVRecord firstRecord = records.get(0);
            /* read */ boolean isMapped = firstRecord.isMapped("name");
            System.out.println("Is 'name' mapped? " + isMapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}