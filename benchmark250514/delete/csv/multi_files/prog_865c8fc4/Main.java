import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Initialize CSV handling
        CSVHandler csvHandler = new CSVHandler();
        csvHandler.initializeFormat();
        CSVRecord record = csvHandler.createRecord();

        // Read the comment from the CSVRecord
        CommentReader commentReader = new CommentReader();
        String comment = commentReader.readComment(record);
        System.out.println("CSV Comment: " + comment);

        // Create a course and add students
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        course.addStudent(student1);
        course.addStudent(student2);

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}