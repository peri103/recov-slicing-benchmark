import com.google.common.collect.HashMultimap;

public class Student {
    private String name;
    private MultimapHandler multimapHandler = new MultimapHandler();

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(String courseName, String grade) {
        multimapHandler.addEntry(courseName, grade);
    }

    public HashMultimap<String, String> getCourses() {
        return multimapHandler.getMultimap();
    }
}
