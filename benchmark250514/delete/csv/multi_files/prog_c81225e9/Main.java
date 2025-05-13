import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a CSVHandler and write a record
            CSVHandler csvHandler = new CSVHandler();
            csvHandler.writeRecord("Alice", "A", "Math");

            // Create a CSVReader to read the content
            CSVReader csvReader = new CSVReader(csvHandler.getCSVContent());
            String recordString = csvReader.readRecord();
            System.out.println("CSV Record: " + recordString);

            // Create a Course and add Students
            Course mathCourse = new Course("Mathematics");
            Student alice = new Student("Alice");
            alice.addGrade(95);
            Student bob = new Student("Bob");
            bob.addGrade(88);

            mathCourse.addStudent(alice);
            mathCourse.addStudent(bob);

            // Print students and their grades
            for (Student student : mathCourse.getStudents()) {
                System.out.println("Student: " + student.getGrades());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}