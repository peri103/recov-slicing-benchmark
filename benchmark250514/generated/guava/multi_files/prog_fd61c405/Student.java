public class Student {
    private String name;
    private Course course;

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public void addGrade(String assignment, int grade) {
        course.addGrade(name, assignment, grade);
    }

    public Integer getGrade(String assignment) {
        return course.getGrade(name, assignment);
    }
}
