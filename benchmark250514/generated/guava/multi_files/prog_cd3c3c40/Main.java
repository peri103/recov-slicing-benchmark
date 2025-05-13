public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Student student = new Student("John Doe", 123);

        // Enroll the student in the course
        course.enrollStudent(101, student.getStudentId(), student.getName());

        // Perform some unrelated operations
        int[] numbers = {1, 2, 3, 4, 5};
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        System.out.println("Total of numbers: " + total);

        // Retrieve the student name from the course
        /* read */ String studentName = course.getStudentName(101, 123);

        System.out.println("Enrolled student: " + studentName);
    }
}