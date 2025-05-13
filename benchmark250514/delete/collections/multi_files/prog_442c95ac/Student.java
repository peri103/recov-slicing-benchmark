public class Student {
    private String name;
    private CustomMap customMap = new CustomMap();

    public Student(String name) {
        this.name = name;
    }

    public void addCourse(int courseId, String courseName) {
        customMap.addEntry(courseId, courseName);
    }

    public String getCourseName(int courseId) {
        return customMap.getEntry(courseId);
    }

    public void displayCourses() {
        System.out.println("Courses for student: " + name);
        customMap.displayEntries();
    }
}
