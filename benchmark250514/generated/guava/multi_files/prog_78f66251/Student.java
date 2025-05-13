public class Student {
    private String name;
    private Course course;

    public Student(String name) {
        this.name = name;
        this.course = new Course();
    }

    public void enrollCourse(String courseName) {
        course.setCourseName(courseName);
    }

    public String getCourseName() {
        return course.getCourseName();
    }

    public void addScore(int score) {
        course.addScore(score);
    }

    public int getScore(int index) {
        return course.getScore(index);
    }
}
