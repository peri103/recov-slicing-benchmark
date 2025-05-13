import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CSVUtils csvUtils = new CSVUtils();
        csvUtils.setRecordSeparator("\n");

        String csvData = "Name,Age,Location\nJohn,30,New York\nJane,25,Los Angeles";

        try {
            List<CSVRecord> records = csvUtils.parseCSV(csvData);

            ArrayList<Student> students = new ArrayList<>();

            for (CSVRecord record : records) {
                String name = record.get(0);
                int age = Integer.parseInt(record.get(1));
                String location = record.get(2);
                students.add(new Student(name, age, location));
            }

            for (Student student : students) {
                System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Location: " + student.getLocation());
            }

            /* read */ String firstRecordString = records.get(0).toString();
            System.out.println("First record: " + firstRecordString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}