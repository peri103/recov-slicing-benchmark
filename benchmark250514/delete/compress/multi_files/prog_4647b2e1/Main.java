import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Using GzipHandler to manage GzipParameters
        GzipHandler gzipHandler = new GzipHandler();
        byte[] extraData = {1, 2, 3, 4, 5};
        gzipHandler.setExtraData(extraData);

        // Creating students and enrolling them in a course
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        student1.addScore(85);
        student2.addScore(90);

        Course course = new Course("Mathematics");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Displaying enrolled students and their scores
        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Student: " + student.getName());
            System.out.println("Scores: " + student.getScores());
        }

        // Retrieving extra data from GzipHandler
        /* read */ byte[] retrievedData = gzipHandler.getExtraData();
        System.out.print("Retrieved extra data: ");
        for (byte b : retrievedData) {
            System.out.print(b + " ");
        }
    }
}