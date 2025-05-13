import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob");
        student.addNote("Attended class on Monday.");
        student.addNote("Completed assignment.");
        student.removeCharacterFromNotes(8);

        Course course = new Course("Mathematics");
        course.enrollStudent("Bob");
        course.enrollStudent("Alice");

        for (String enrolledStudent : course.getEnrolledStudents()) {
            System.out.println(enrolledStudent + " is enrolled in " + course.getCourseName());
        }

        String notes = student.getNotes();
        System.out.println(student.getName() + "'s notes: " + notes);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * i);
        }

        for (int number : numbers) {
            System.out.println("Square: " + number);
        }
    }
}