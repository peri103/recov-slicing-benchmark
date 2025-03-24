import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        mathCourse.addStudent(alice);
        mathCourse.addStudent(bob);

        alice.addGrade(95);
        bob.addGrade(85);

        // Perform some operations on the course and students
        for (Student student : mathCourse.getStudents()) {
            System.out.println(student.getName() + "'s grades:");
            for (int grade : student.getGrades()) {
                System.out.println(grade);
            }
        }

        // Reading the first grade of the first student
        /* read */ int firstGrade = mathCourse.getStudents().getFirst().getGrades().getFirst();
        System.out.println("First grade in the course: " + firstGrade);

        // Adding more complex operations
        LinkedList<String> subjects = new LinkedList<>();
        subjects.add("Algebra");
        subjects.add("Geometry");
        subjects.add("Calculus");

        for (String subject : subjects) {
            System.out.println("Subject: " + subject);
        }
    }
}