import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            CSVHandler csvHandler = new CSVHandler();
            csvHandler.addComment("This is a comment");

            CSVReader csvReader = new CSVReader();
            String comment = csvReader.readComment(csvHandler.getCSVData());
            System.out.println(comment);

            // Additional complexity with Course and Student
            Course course = new Course("Computer Science");
            Student student1 = new Student("Alice");
            Student student2 = new Student("Bob");

            course.enrollStudent(student1);
            course.enrollStudent(student2);

            for (Student student : course.getEnrolledStudents()) {
                System.out.println("Enrolled student: " + student.getName());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}