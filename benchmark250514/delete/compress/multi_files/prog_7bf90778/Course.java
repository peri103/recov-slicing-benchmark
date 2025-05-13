import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getTopStudent() {
        Student topStudent = null;
        double highestAverage = 0.0;
        for (Student student : students) {
            double average = student.getAverageGrade();
            if (average > highestAverage) {
                highestAverage = average;
                topStudent = student;
            }
        }
        return topStudent;
    }

    public String getCourseName() {
        return courseName;
    }
}
