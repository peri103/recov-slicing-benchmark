import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Create a course and enroll students
        Course math = new Course("Mathematics");
        math.enrollStudent(alice);
        math.enrollStudent(bob);

        // Print enrolled students
        List<Student> enrolledStudents = math.getEnrolledStudents();
        System.out.println("Enrolled students in " + math.getCourseName() + ":");
        for (Student student : enrolledStudents) {
            System.out.println(student.getName());
        }

        // Perform operations with ImmutableSortedSet
        ImmutableSetOperations setOperations = new ImmutableSetOperations();
        setOperations.addElement(1);
        setOperations.addElement(3);
        setOperations.addElement(2);

        // Build the set and check if it contains a value
        ImmutableSortedSet<Integer> sortedSet = setOperations.buildSet();
        /* read */ boolean containsValue = sortedSet.contains(1);
        System.out.println("Sorted set contains 1: " + containsValue);
    }
}