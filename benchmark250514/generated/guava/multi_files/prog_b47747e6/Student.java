public class Student {
    private String name;
    private Course course;

    public Student(String name) {
        this.name = name;
        this.course = new Course();
    }

    public void enroll(String courseName, String courseCode) {
        course.setCourseDetails(courseName, courseCode);
    }

    public void addScore(String assignment, int score) {
        course.addAssignmentScore(assignment, score);
    }

    public Integer getScore(String assignment) {
        return course.getAssignmentScore(assignment);
    }

    public String getName() {
        return name;
    }
}
