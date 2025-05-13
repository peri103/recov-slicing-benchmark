import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Long> groupIds;

    public Course(String courseName) {
        this.courseName = courseName;
        this.groupIds = new ArrayList<>();
    }

    public void addGroupId(long groupId) {
        groupIds.add(groupId);
    }

    public ArrayList<Long> getGroupIds() {
        return groupIds;
    }

    public String getCourseName() {
        return courseName;
    }
}
