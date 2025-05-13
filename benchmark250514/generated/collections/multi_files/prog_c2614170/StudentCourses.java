import org.apache.commons.collections4.list.CursorableLinkedList;

public class StudentCourses {
    private CursorableLinkedList<String> courses = new CursorableLinkedList<>();

    public void addCourse(String courseName) {
        /* write */ courses.add(courseName);
    }

    public String getFirstCourse() {
        /* read */ return courses.get(0);
    }
}
