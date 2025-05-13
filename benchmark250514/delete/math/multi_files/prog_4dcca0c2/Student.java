public class Student {
    private String name;
    private Course course;

    public Student(String name) {
        this.name = name;
        this.course = new Course();
    }

    public void enrollInCourse(String courseName) {
        course.setCourseName(courseName);
    }

    public String getCourseName() {
        return course.getCourseName();
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Enrolled Course: " + getCourseName());
    }
}
