import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvData = "name, age\nJohn Doe, 30\nJane Doe, 25";

        try {
            CSVHandler csvHandler = new CSVHandler(csvData);
            List<CSVRecord> records = csvHandler.getRecords();

            for (CSVRecord record : records) {
                String name = record.get("name");
                int age = Integer.parseInt(record.get("age"));

                Student student = new Student(name, age);
                System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge());

                /* read */
                boolean isSet = record.isSet("name");
                System.out.println("Is 'name' set: " + isSet);
                break; // Ensure read is executed only once
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}