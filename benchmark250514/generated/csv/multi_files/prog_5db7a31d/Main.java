import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // CSV Operations
            CSVOperations csvOperations = new CSVOperations();
            csvOperations.writeRecord("John", "Doe", "30");

            // Read CSV
            CSVReader csvReader = new CSVReader(csvOperations.getCSVContent());
            String firstName = csvReader.readFirstName();
            System.out.println("First name from CSV: " + firstName);

            // Student Operations
            Student student = new Student("Alice");
            student.addScore(85);
            student.addScore(90);
            student.addScore(95);

            System.out.println("Student: " + student.getName());
            for (Integer score : student.getScores()) {
                System.out.println("Score: " + score);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}