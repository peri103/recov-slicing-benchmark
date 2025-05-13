public class Main {
    public static void main(String[] args) {
        Student student = new Student("John");
        student.addRangeToHandler(1, 10, "Value for range 1-10");

        Course course = new Course("Mathematics");
        course.addStudent(student);

        for (Student enrolledStudent : course.getStudents()) {
            System.out.println("Student: " + enrolledStudent.getName() + " in course: " + course.getCourseName());
            /* read */ String value = enrolledStudent.getValueFromHandler(5);
            System.out.println("Read value: " + value);
        }
    }
}