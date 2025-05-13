public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob", 20);
        Course course = new Course("Mathematics", "Dr. Smith");

        student.enrollCourse(course.getCourseName());

        // Simulate some unrelated operations
        int a = 5, b = 10;
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // More unrelated operations
        int product = a * b;
        System.out.println("Product: " + product);

        // Read the course status
        /* read */ String courseStatus = student.getCourseStatus(course.getCourseName());
        System.out.println("Course Status for " + course.getCourseName() + ": " + courseStatus);
    }
}