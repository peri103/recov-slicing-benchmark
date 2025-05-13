public class Student {
    private String name;
    private int age;
    private Course course;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.course = new Course();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void enrollInCourse(String courseName, int credits) {
        course.addCourse(courseName, credits);
    }

    public Course getCourse() {
        return course;
    }
}
