public class Course {
    private String courseName;
    private int credits;

    public Course(String courseName, int credits) {
        this.courseName = courseName;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return courseName + " (" + credits + " credits)";
    }
}