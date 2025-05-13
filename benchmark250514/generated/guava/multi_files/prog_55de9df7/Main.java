public class Main {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.enrollInCourse("Math 101");
        student.attendClass("Algebra");
        student.attendClass("Geometry");
        student.attendClass("Algebra");

        System.out.println("Course: " + student.getCourseName());
        System.out.println("Algebra Attendance: " + student.getClassAttendanceCount("Algebra"));
        System.out.println("Geometry Attendance: " + student.getClassAttendanceCount("Geometry"));
    }
}