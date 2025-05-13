public class Student {
    private String name;
    private int age;
    private CourseEnrollment enrollment;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.enrollment = new CourseEnrollment();
    }

    public void enrollInCourse(String courseName) {
        enrollment.addCourse(courseName);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public CourseEnrollment getEnrollment() {
        return enrollment;
    }
}
