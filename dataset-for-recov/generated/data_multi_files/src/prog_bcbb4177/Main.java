import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Using CustomDeque
        CustomDeque customDeque = new CustomDeque();
        customDeque.addValue(42);
        
        // Setting up a course and students
        Course course = new Course("Mathematics");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        
        alice.addGrade(85);
        alice.addGrade(90);
        bob.addGrade(78);
        bob.addGrade(82);
        
        course.addStudent(alice);
        course.addStudent(bob);
        
        // Print students and their grades
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getGrades());
            for (int grade : student.getGrades()) {
                System.out.println("Grade: " + grade);
            }
        }
        
        // Read operation from CustomDeque
        try {
            /* read */ int value = customDeque.takeValue();
            System.out.println("Value from deque: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}