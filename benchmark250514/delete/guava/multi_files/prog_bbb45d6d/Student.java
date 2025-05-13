public class Student {
    private String name;
    private Course course;

    public Student(String name) {
        this.name = name;
        this.course = new Course();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(String courseName) {
        course.setCourseName(courseName);
    }

    public String getCourseName() {
        return course.getCourseName();
    }

    public void addGrade(int grade) {
        course.addGrade(grade);
    }

    public int getGrade(int index) {
        return course.getGrade(index);
    }
}
