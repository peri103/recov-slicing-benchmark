public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        course.enrollStudent("Alice");
        course.enrollStudent("Bob");

        // Additional logic
        String firstStudent = course.getFirstStudent();
        System.out.println("First student enrolled in " + course.courseName + ": " + firstStudent);

        // More unrelated logic
        Course mathCourse = new Course("Mathematics");
        mathCourse.enrollStudent("Charlie");
        System.out.println("First student enrolled in " + mathCourse.courseName + ": " + mathCourse.getFirstStudent());
    }
}