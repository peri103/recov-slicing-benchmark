public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        Student student1 = new Student("Alice", mathCourse);
        Student student2 = new Student("Bob", mathCourse);

        mathCourse.markAttendance(student1.getName());
        mathCourse.markAttendance(student2.getName());
        mathCourse.markAttendance(student1.getName());

        System.out.println("Course: " + mathCourse.getCourseName());
        System.out.println("Attendance for Alice: " + mathCourse.getAttendanceCount("Alice"));
        System.out.println("Attendance for Bob: " + mathCourse.getAttendanceCount("Bob"));

        /* read */ int aliceAttendance = mathCourse.getAttendanceCount("Alice");
        System.out.println("Final Attendance Count for Alice: " + aliceAttendance);
    }
}