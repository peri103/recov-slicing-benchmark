import org.apache.commons.collections4.list.NodeCachingLinkedList;

public class Course {
    private String courseName;
    private NodeCachingLinkedList<Integer> grades;

    public Course(String courseName) {
        this.courseName = courseName;
        this.grades = new NodeCachingLinkedList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addGrade(int grade) {
        /* write */ grades.add(grade);
    }

    public int getGrade(int index) {
        return grades.get(index);
    }
}
