import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20);
        student.setStudentOperatingSystem(3);

        // Additional code to manage a list of students
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(new Student("Jane Smith", 22));

        // Display student information
        for (Student s : students) {
            System.out.println("Name: " + s.getName() + ", Age: " + s.getAge());
        }

        // Access the operating system value for the student
        /* read */ int osValue = student.getStudentOperatingSystem();
        System.out.println("Operating System value for " + student.getName() + ": " + osValue);

        // Additional code for processing student list
        int totalAge = 0;
        for (Student s : students) {
            totalAge += s.getAge();
        }
        System.out.println("Total age of students: " + totalAge);
    }
}