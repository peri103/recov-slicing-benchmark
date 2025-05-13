import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Create a renderer and set series paint
        CustomRenderer renderer = new CustomRenderer();
        /* write */ renderer.setSeriesPaint(0, Color.RED);

        // Create students and a course
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        student1.addGrade(85);
        student2.addGrade(90);

        Course course = new Course("Mathematics");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Display course information
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Student: " + student.getName() + ", Grades: " + student.getGrades());
        }

        // Read the paint for series 0
        /* read */ Paint paint = renderer.getSeriesPaint(0);
        System.out.println("Paint for series 0: " + paint);
    }
}