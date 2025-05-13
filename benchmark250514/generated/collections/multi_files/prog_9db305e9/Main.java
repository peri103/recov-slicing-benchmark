public class Main {
    public static void main(String[] args) {
        // Create a course
        Course course = new Course("Mathematics");

        // Create a student and enroll in the course
        Student student = new Student(1, "Alice", course);
        student.enrollInCourse();

        // Additional operations unrelated to the write-read pair
        int x = 5;
        int y = 10;
        int sum = x + y;
        System.out.println("Sum: " + sum);

        // Read the student name from the course
        /* read */ String studentName = student.getEnrolledStudentName();

        // Print the student name to verify the read operation
        System.out.println("Enrolled student name: " + studentName);

        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of numbers 1 to 3: " + product);
    }
}