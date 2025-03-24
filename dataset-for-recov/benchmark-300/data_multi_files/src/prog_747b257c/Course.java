public class Course {
    private String courseName;
    private Student student;

    public Course(String courseName, Student student) {
        this.courseName = courseName;
        this.student = student;
    }

    public void enrollStudent(int data) {
        student.addData(data);
    }

    public LinkedList<Integer> getStudentData() {
        return student.getDataList();
    }
}
