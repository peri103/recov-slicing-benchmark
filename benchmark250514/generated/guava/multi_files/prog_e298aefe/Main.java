public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Alice");

        // Enroll the student in a course
        student.enrollCourse(101, "Mathematics");

        // Enroll the student in more courses
        student.enrollCourse(102, "Physics");
        student.enrollCourse(103, "Chemistry");

        // Retrieve and print the course name for the first course
        /* read */ String courseName = student.getCourseName(101);
        System.out.println("Course Name: " + courseName);

        // Print other enrolled courses
        System.out.println("Course Name: " + student.getCourseName(102));
        System.out.println("Course Name: " + student.getCourseName(103));
    }
}