public class Student {
    private String name;
    private int age;
    private Course course;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.course = new Course();
    }

    public void enrollInCourse(String courseName) {
        course.setCourseName(courseName);
    }

    public String getCourseName() {
        return course.getCourseName();
    }

    public void addScore(String subject, int score) {
        course.addScore(subject, score);
    }

    public int getScore(String subject) {
        return course.getScore(subject);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
