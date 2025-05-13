import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize CSV utility and print records
            CSVUtil csvUtil = new CSVUtil();
            List<String> record1 = Arrays.asList("value1", "value2");
            csvUtil.printRecord(record1);

            // Create a student and add scores
            Student student = new Student("Bob");
            student.addScore(85);
            student.addScore(90);
            System.out.println("Student " + student.getName() + " scores: " + student.getScores());

            // Read the comment using CSVReader
            CSVReader csvReader = new CSVReader(csvUtil.getCSVContent());
            String comment = csvReader.getComment();
            System.out.println("CSV Comment: " + comment);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}