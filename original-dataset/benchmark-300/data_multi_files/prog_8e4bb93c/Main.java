import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        Course mathCourse = new Course("Mathematics", 101);

        student.storeGrade(mathCourse.getCourseName(), 95);

        HashMap<String, Integer> grades = student.getGrades();
        /* read */ int mathGrade = grades.get(mathCourse.getCourseName());

        System.out.println("Grade in " + mathCourse.getCourseName() + ": " + mathGrade);

        // Additional complexity
        Course physicsCourse = new Course("Physics", 102);
        student.storeGrade(physicsCourse.getCourseName(), 88);

        int physicsGrade = grades.get(physicsCourse.getCourseName());
        System.out.println("Grade in " + physicsCourse.getCourseName() + ": " + physicsGrade);

        // Calculate average grade
        double averageGrade = (mathGrade + physicsGrade) / 2.0;
        System.out.println("Average grade: " + averageGrade);
    }
}