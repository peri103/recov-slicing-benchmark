import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            StreamHandler streamHandler = new StreamHandler();
            Course course = new Course("Computer Science");

            Student alice = new Student("Alice");
            alice.addGrade(85);
            alice.addGrade(92);

            Student bob = new Student("Bob");
            bob.addGrade(78);
            bob.addGrade(88);

            course.addStudent(alice);
            course.addStudent(bob);

            streamHandler.setStreamSize(2048);

            for (Student student : course.getStudents()) {
                System.out.println("Student: " + student.getName());
                System.out.println("Grades: " + student.getGrades());
            }

            int streamSize = streamHandler.getStreamSize();
            System.out.println("Stream Size: " + streamSize);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}