public class Student {
    private String name;
    private Course course = new Course();

    public Student(String name) {
        this.name = name;
    }

    public void submitAssignment(String assignment) {
        course.addAssignment(name, assignment);
    }

    public Collection<String> viewAssignments() {
        return course.getAssignments(name);
    }
}