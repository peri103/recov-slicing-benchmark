public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        course.addCourseComment("This is a comment for the course.");
        course.displayCourseComments();

        // Additional complex operations
        for (int i = 0; i < 3; i++) {
            course.addCourseComment("Additional comment " + i);
        }
        course.displayCourseComments();
    }
}