import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String csvData = "name,age\nJohn Doe,30\nJane Doe,25";

        CSVUtils csvUtils = new CSVUtils();
        List<CSVRecord> records = csvUtils.parseCSV(csvData);

        StudentProcessor processor = new StudentProcessor();
        processor.processRecords(records);

        List<Student> students = processor.getStudents();
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }

        // Access the comment from the first record
        if (!records.isEmpty()) {
            /* read */ String comment = records.get(0).getComment();
            System.out.println("Comment: " + comment);
        }
    }
}