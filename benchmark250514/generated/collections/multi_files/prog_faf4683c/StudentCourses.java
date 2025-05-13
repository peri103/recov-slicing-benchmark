import org.apache.commons.collections4.list.CursorableLinkedList;

public class StudentCourses {
    private CursorableLinkedList<String> courses = new CursorableLinkedList<>();

    public void addCourse(String courseName) {
        /* write */ courses.add(courseName);
    }

    public String getCourse(int index) {
        /* read */ return courses.get(index);
    }

    public int getTotalCourses() {
        return courses.size();
    }
}
