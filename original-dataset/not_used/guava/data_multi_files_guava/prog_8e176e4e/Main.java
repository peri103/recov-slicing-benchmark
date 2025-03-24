import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create students and a course
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Course course = new Course("Mathematics");
        
        course.enrollStudent(student1);
        course.enrollStudent(student2);
        
        // Create grades table and add grades
        GradesTable gradesTable = new GradesTable();
        gradesTable.addGrade(student1.getName(), course.getCourseName(), 90);
        gradesTable.addGrade(student2.getName(), course.getCourseName(), 85);

        // Retrieve and print grades
        /* read */ Integer aliceGrade = gradesTable.getGrade(student1.getName(), course.getCourseName());
        System.out.println("Alice's grade in " + course.getCourseName() + ": " + aliceGrade);
    }
}