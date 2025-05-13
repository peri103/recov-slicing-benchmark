import java.util.ArrayList;

public class Student {
    private String name;
    private UserEntry userEntry;
    private ArrayList<String> courses;

    public Student(String name) {
        this.name = name;
        this.userEntry = new UserEntry();
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(String course) {
        courses.add(course);
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setUserName(String userName) {
        userEntry.setUserName(userName);
    }

    public String getUserName() {
        return userEntry.getUserName();
    }

    public void setGroupName(String groupName) {
        userEntry.setGroupName(groupName);
    }

    public String getGroupName() {
        return userEntry.getGroupName();
    }
}