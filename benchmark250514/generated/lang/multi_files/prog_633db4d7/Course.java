public class Course {
    private String courseName;
    private DataHolder dataHolder;

    public Course(String courseName) {
        this.courseName = courseName;
        this.dataHolder = new DataHolder();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setScore(double score) {
        dataHolder.setDoubleValue(score);
    }

    public double getScore() {
        return dataHolder.getDoubleValue();
    }
}
