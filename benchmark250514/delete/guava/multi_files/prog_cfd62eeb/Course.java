import com.google.common.collect.LinkedHashMultimap;
import java.util.Iterator;

public class Course {
    private String courseName;
    private DataManager dataManager = new DataManager();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(String studentName) {
        dataManager.addData(courseName, studentName);
    }

    public String getFirstStudent() {
        LinkedHashMultimap<String, String> data = dataManager.getData();
        Iterator<String> iterator = data.get(courseName).iterator();
        /* read */ return iterator.hasNext() ? iterator.next() : null;
    }
}
