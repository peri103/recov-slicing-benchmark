import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        mathCourse.addStudent(student1);
        mathCourse.addStudent(student2);

        // Add grades to students
        student1.addGrade(90);
        student2.addGrade(85);
        student1.addGrade(95);
        student2.addGrade(80);

        // Read the last grade of student1
        LinkedList<Integer> grades = student1.getGrades();
        /* read */ int lastGrade = grades.getLast();
        System.out.println(student1.getName() + "'s last grade in " + mathCourse.getCourseName() + " is: " + lastGrade);

        // Print all grades of student1
        System.out.println(student1.getName() + "'s grades:");
        for (int grade : grades) {
            System.out.println(grade);
        }
    }
}