public class Student {
    private String name;
    private TransformedMapHandler mapHandler;

    public Student(String name) {
        this.name = name;
        this.mapHandler = new TransformedMapHandler();
    }

    public void enrollInCourse(String courseName) {
        mapHandler.addValue("courses", courseName);
    }

    public Collection<String> getCourses() {
        return mapHandler.getValues("courses");
    }
}
