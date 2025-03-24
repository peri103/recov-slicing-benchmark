import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course course = new Course("Math");

        course.addStudent(student);

        /* write */ student.addScore(95);

        // Adding more students and scores
        Student student2 = new Student("Bob");
        student2.addScore(85);
        course.addStudent(student2);

        Student student3 = new Student("Charlie");
        student3.addScore(90);
        course.addStudent(student3);

        // Iterating over the students in the course
        for (Student s : course.getStudents()) {
            System.out.println("Student: " + s.getScores());
        }

        /* read */ boolean contains = student.getScores().contains(95);
        System.out.println("Does Alice have a score of 95? " + contains);
    }
}