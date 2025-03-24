public class Course {
    private String courseName;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void displayEnrolledStudents() {
        for (Student student : enrolledStudents) {
            System.out.println("Enrolled Student: " + student.getName());
        }
    }
}
