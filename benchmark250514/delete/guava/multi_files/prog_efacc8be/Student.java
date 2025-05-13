import com.google.common.collect.ImmutableMultimap;

public class Student {
    private String name;
    private Course course;

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public void addGrade(int grade) {
        course.addGrade(name, grade);
    }

    public ImmutableMultimap<String, Integer> getGrades() {
        return course.buildGrades();
    }
}
