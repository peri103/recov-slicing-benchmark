import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course mathCourse = new Course("Mathematics");

        student.enrollCourse(mathCourse);
        mathCourse.addScore(student.getName(), 95);

        List<Course> courses = student.getCourses();
        for (Course course : courses) {
            if (course.getCourseName().equals("Mathematics")) {
                /* read */ Integer score = course.getStudentScores().get(student.getName()).iterator().next();
                System.out.println("Score in " + course.getCourseName() + ": " + score);
            }
        }
    }
}