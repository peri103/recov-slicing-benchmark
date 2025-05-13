import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<UserEntry> enrolledUsers;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledUsers = new ArrayList<>();
    }

    public void enrollUser(UserEntry user) {
        enrolledUsers.add(user);
    }

    public ArrayList<UserEntry> getEnrolledUsers() {
        return enrolledUsers;
    }

    public void printEnrolledUserIds() {
        for (UserEntry user : enrolledUsers) {
            System.out.println("Enrolled User ID: " + user.getUserId());
        }
    }
}
