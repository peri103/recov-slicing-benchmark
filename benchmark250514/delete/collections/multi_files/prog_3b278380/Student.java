public class Student {
    private String name;
    private int age;
    private Course course;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.course = new Course();
    }

    public void enroll(String courseName) {
        course.setCourseName(courseName);
    }

    public String getCourseName() {
        return course.getCourseName();
    }

    public void addGrade(String subject, int grade) {
        course.addGrade(subject, grade);
    }

    public int getGrade(String subject) {
        return course.getGrade(subject);
    }
}
