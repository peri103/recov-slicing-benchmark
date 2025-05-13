import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UnixPermissionManager permissionManager = new UnixPermissionManager();
        permissionManager.setPermission(0755);

        Student student = new Student("Alice");
        student.enroll("Math");
        student.enroll("Science");

        Course mathCourse = new Course("Math");
        mathCourse.addStudent(student.getName(), 85);

        Course scienceCourse = new Course("Science");
        scienceCourse.addStudent(student.getName(), 90);

        System.out.println("Courses for " + student.getName() + ": " + student.getCourses());
        System.out.println("Math grade: " + mathCourse.getStudentGrade(student.getName()));
        System.out.println("Science grade: " + scienceCourse.getStudentGrade(student.getName()));

        /* read */ int mode = permissionManager.getPermission();
        System.out.println("Unix permission mode: " + mode);
    }
}