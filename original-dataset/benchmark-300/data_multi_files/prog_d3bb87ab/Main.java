import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course mathCourse = new Course("Math", 101);
        Course scienceCourse = new Course("Science", 102);

        student.storeGrade(mathCourse.getCourseName(), 95);
        student.storeGrade(scienceCourse.getCourseName(), 88);

        List<Course> courses = new ArrayList<>();
        courses.add(mathCourse);
        courses.add(scienceCourse);

        for (Course course : courses) {
            System.out.println("Course: " + course.getCourseName() + ", Grade: " + student.getGrade(course.getCourseName()));
        }

        /* read */ Integer mathGrade = student.getGrade(mathCourse.getCourseName());
        System.out.println("Math Grade: " + mathGrade);
    }
}