import com.google.common.collect.HashBasedTable;
import com.google.common.collect.RowSortedTable;

public class CourseEnrollment {
    private RowSortedTable<String, String, Integer> courses = HashBasedTable.create();

    public void addCourse(String courseName, int credits) {
        /* write */ courses.put(courseName, "credits", credits);
    }

    public Integer getCourseCredits(String courseName) {
        return /* read */ courses.get(courseName, "credits");
    }

    public RowSortedTable<String, String, Integer> getCourses() {
        return courses;
    }
}
