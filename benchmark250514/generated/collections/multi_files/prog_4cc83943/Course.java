import org.apache.commons.collections4.bag.TreeBag;

public class Course {
    private TreeBag<String> enrolledStudents = new TreeBag<>();

    public void enrollStudent(String studentName) {
        /* write */ enrolledStudents.add(studentName);
    }

    public int getEnrollmentCount(String studentName) {
        return enrolledStudents.getCount(studentName);
    }
}