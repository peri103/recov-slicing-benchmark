import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        SynchronousQueueWriter writer = new SynchronousQueueWriter(queue);
        SynchronousQueueReader reader = new SynchronousQueueReader(queue);

        writer.writeValue(42);
        reader.readValue();

        Student student = new Student("Alice");
        student.addScore(85);
        student.addScore(90);

        Course course = new Course("Mathematics");
        course.enrollStudent(student);

        for (Student enrolledStudent : course.getStudents()) {
            System.out.println("Student: " + enrolledStudent.getName());
            System.out.println("Scores: " + enrolledStudent.getScores());
        }
    }
}