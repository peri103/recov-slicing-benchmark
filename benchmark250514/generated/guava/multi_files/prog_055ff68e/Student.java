public class Student {
    private String name;
    private CustomSet coursesCompleted = new CustomSet();

    public Student(String name) {
        this.name = name;
    }

    public void completeCourse(int courseId) {
        coursesCompleted.addElement(courseId);
    }

    public boolean hasCompletedCourse(int courseId) {
        /* read */ return coursesCompleted.contains(courseId);
    }

    public String getName() {
        return name;
    }
}
