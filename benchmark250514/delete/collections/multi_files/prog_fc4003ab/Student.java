public class Student {
    private String name;
    private int age;
    private Course course;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void enrollInCourse(Course course) {
        this.course = course;
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
