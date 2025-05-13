import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        CSVHandler csvHandler = new CSVHandler();
        csvHandler.setNullString("NULL");

        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addScore(85);
        student2.addScore(90);

        course.addStudent(student1);
        course.addStudent(student2);

        // Display student scores
        for (Student student : course.getStudents()) {
            System.out.println("Scores for " + student.getName() + ": " + student.getScores());
        }

        // Use read method to check if a value is set at index 1 (which should be null)
        CSVRecord record = csvHandler.getRecord();
        /* read */ boolean isSet = record.isSet(1);

        // Output the result
        System.out.println("Is the value at index 1 set? " + isSet);
    }
}