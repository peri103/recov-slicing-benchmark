import com.google.common.collect.LinkedHashMultiset;

public class Course {
    private LinkedHashMultiset<Integer> studentIDs = LinkedHashMultiset.create();

    public void enrollStudent(int studentID) {
        /* write */ studentIDs.add(studentID);
    }

    public int getStudentCount(int studentID) {
        return studentIDs.count(studentID);
    }
}
