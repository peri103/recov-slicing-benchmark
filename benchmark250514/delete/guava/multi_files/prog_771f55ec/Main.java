public class Main {
    public static void main(String[] args) {
        CourseManager courseManager = new CourseManager();
        courseManager.addCourse("Math");
        courseManager.enrollStudent("Math", "Alice");
        courseManager.enrollStudent("Math", "Bob");

        ImmutableListMultimap<String, String> students = courseManager.getCourseStudents("Math");
        if (students != null) {
            /* read */ String firstStudent = students.get("students").get(0);
            System.out.println("First student in Math course: " + firstStudent);
        }
    }
}