import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Mathematics");
        Student student = new Student("Alice");
        
        student.addGrade(95);
        course.addStudent(student);
        
        LinkedList<Integer> grades = student.getGrades();
        /* read */ int grade = grades.getFirst();
        System.out.println("Grade for " + student.getName() + ": " + grade);
        
        System.out.println("Course: " + course.getCourseName());
        for (Student s : course.getStudents()) {
            System.out.println("Student: " + s.getName());
        }
    }
}