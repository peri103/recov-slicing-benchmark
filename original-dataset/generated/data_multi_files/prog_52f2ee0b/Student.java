import java.util.ArrayList;

public class Student {
    private String name;
    private VectorOperations vectorOps;
    private ArrayList<String> courses = new ArrayList<>();

    public Student(String name, VectorOperations vectorOps) {
        this.name = name;
        this.vectorOps = vectorOps;
    }

    public void enrollCourse(String course) {
        courses.add(course);
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void addScore(int score) {
        vectorOps.addElement(score);
    }

    public int getScore(int index) {
        return vectorOps.getElement(index);
    }

    public String getName() {
        return name;
    }
}
