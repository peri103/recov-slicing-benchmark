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
        course.addCourse(courseName);
    }

    public Course getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
