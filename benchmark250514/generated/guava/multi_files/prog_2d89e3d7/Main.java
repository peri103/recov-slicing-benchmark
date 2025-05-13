public class Main {
    public static void main(String[] args) {
        // RangeMap operations
        MyRangeMap myRangeMap = new MyRangeMap();
        myRangeMap.addRange(11, 20, "Value in range 11 to 20");

        // Student and Course operations
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Course course = new Course("Mathematics");
        course.addStudent(student1);
        course.addStudent(student2);

        student1.enroll(course.getCourseName());
        student2.enroll(course.getCourseName());

        // Display student information
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            System.out.println("Enrolled in: " + student.getCourses());
        }

        // Final read operation from MyRangeMap
        /* read */ String value = myRangeMap.getValue(5);
        System.out.println(value);
    }
}