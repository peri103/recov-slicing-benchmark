import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Create a new CourseTable
        CourseTable courseTable = new CourseTable();

        // Create a new Student
        Student student = new Student("John Doe", 1);

        // Enroll the student in some courses
        student.enrollCourse("Math");
        student.enrollCourse("Science");

        // Add courses to the CourseTable
        courseTable.addCourse(student.getId(), 101, "Math");
        courseTable.addCourse(student.getId(), 102, "Science");

        // Retrieve the table and perform operations
        Table<Integer, Integer, String> table = courseTable.getTable();
        
        // Read the course name for student id 1 and course id 101
        /* read */ String courseName = table.get(1, 101);
        
        // Print the course name
        System.out.println(courseName);

        // Additional unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
    }
}