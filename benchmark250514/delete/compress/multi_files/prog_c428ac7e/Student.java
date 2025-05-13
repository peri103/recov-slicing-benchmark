public class Student {
    private String name;
    private int age;
    private Course course;

    public Student(String name, int age, Course course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Course getCourse() {
        return course;
    }
}
