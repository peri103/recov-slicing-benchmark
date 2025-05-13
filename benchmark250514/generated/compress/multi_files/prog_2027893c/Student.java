public class Student {
    private String name;
    private int id;
    private Course course;

    public Student(String name, int id, Course course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Course getCourse() {
        return course;
    }
}
