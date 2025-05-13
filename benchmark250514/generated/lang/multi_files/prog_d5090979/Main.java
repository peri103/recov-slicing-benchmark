import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Work with StrBuilderHandler
        StrBuilderHandler strHandler = new StrBuilderHandler();
        strHandler.modifyStrBuilder();
        
        // Work with Student and Course
        Student student1 = new Student("Alice");
        student1.addScore(85);
        student1.addScore(90);

        Student student2 = new Student("Bob");
        student2.addScore(75);
        student2.addScore(80);

        Course course = new Course("Mathematics");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Scores: " + student.getScores());
        }

        // Print the modified StrBuilder content
        String result = strHandler.getStrBuilderContent();
        System.out.println("StrBuilder Content: " + result);
    }
}