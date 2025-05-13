public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        student.addCourse(101, "Mathematics");
        student.addCourse(102, "Science");
        student.addCourse(103, "History");

        student.displayCourses();

        /* read */ String courseName = student.getCourseName(101);
        System.out.println("Course ID 101: " + courseName);
    }
}