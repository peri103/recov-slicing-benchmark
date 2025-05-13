public class Course {
    private String title;
    private int credits;

    public Course(String title, int credits) {
        this.title = title;
        this.credits = credits;
    }

    public String getTitle() {
        return title;
    }

    public int getCredits() {
        return credits;
    }
}
