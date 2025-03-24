public class CourseManager {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        System.out.println(course);
    }
}