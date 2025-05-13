import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);
        Student student3 = new Student("Charlie", 103);

        // Create a course and enroll students
        Course course = new Course("Computer Science");
        course.enrollStudent(student1.getId());
        course.enrollStudent(student2.getId());

        // Create a list of students
        ImmutableList<Student> students = ImmutableList.of(student1, student2, student3);

        // Print student details
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getId());
        }

        // Check enrollment in the course
        /* read */ boolean isEnrolled = course.getEnrolledStudentIds().contains(student1.getId());

        // Print enrollment status
        System.out.println("Is Alice enrolled in " + course.getCourseName() + "? " + isEnrolled);

        // Print all enrolled student IDs
        for (Integer id : course.getEnrolledStudentIds()) {
            System.out.println("Enrolled Student ID: " + id);
        }
    }
}