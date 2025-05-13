import java.util.List;

public class Main {
    public static void main(String[] args) {
        University university = new University();

        Student alice = new Student("Alice");
        university.addStudent(alice);

        Course mathCourse = new Course();
        alice.enrollInCourse(mathCourse);

        mathCourse.addGrade(95);

        List<Course> courses = alice.getCourses();
        Course firstCourse = courses.get(0);

        List<Integer> grades = firstCourse.getGrades();
        /* read */ int grade = grades.get(0);
        System.out.println("Alice's first grade in the course: " + grade);
    }
}