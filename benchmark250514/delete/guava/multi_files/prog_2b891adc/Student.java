public class Student {
    private String name;
    private Multiset<String> courses;

    public Student(String name) {
        this.name = name;
        this.courses = LinkedHashMultiset.create();
    }

    public void enrollCourse(String courseName) {
        courses.add(courseName);
    }

    public int getCourseCount(String courseName) {
        return courses.count(courseName);
    }

    public String getName() {
        return name;
    }
}
