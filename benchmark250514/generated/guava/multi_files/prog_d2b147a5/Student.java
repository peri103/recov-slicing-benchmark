public class Student {
    private String name;
    private University university;

    public Student(String name, University university) {
        this.name = name;
        this.university = university;
    }

    public void enrollInCourse(String courseName) {
        Course course = new Course(courseName);
        university.addCourse(courseName, course);
    }

    public void addScore(String courseName, String assessment, int score) {
        Course course = university.getCourse(courseName);
        if (course != null) {
            course.addStudentScore(name, assessment, score);
        }
    }

    public Integer getScore(String courseName, String assessment) {
        Course course = university.getCourse(courseName);
        if (course != null) {
            return course.getStudentScore(name, assessment);
        }
        return null;
    }
}
