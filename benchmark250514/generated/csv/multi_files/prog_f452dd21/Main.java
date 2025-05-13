import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CSVConfig csvConfig = new CSVConfig();
        CSVProcessor processor = new CSVProcessor(csvConfig);

        String csvData = "Name, Age\nJohn Doe, 30\nJane Doe, 25";

        try {
            List<Student> students = processor.parseCSV(csvData);

            for (Student student : students) {
                System.out.println("Name: " + student.getName());
                System.out.println("Ages: " + student.getAges());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}