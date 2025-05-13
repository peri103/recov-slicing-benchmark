public class Student {
    private String name;
    private Course course;

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public void addScore(int score) {
        course.addStudentScore(name, score);
    }

    public Collection<Integer> getScores() {
        return course.getStudentScores(name);
    }
}
