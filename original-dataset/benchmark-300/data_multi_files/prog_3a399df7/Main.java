import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course mathCourse = new Course("Mathematics", 101);
        Course physicsCourse = new Course("Physics", 102);

        // Adding grades for the student
        student.addGrade(mathCourse.getCourseName(), 95);
        student.addGrade(physicsCourse.getCourseName(), 88);

        // Retrieving grades for the student
        Hashtable<String, Integer> grades = student.getGrades();
        /* read */ int mathGrade = grades.get(mathCourse.getCourseName());
        int physicsGrade = grades.get(physicsCourse.getCourseName());

        // Printing the student's grades
        System.out.println("Student: " + student.getName());
        System.out.println("Grade in " + mathCourse.getCourseName() + ": " + mathGrade);
        System.out.println("Grade in " + physicsCourse.getCourseName() + ": " + physicsGrade);
    }
}