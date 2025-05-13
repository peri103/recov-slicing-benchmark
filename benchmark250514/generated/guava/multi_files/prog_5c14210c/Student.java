public class Student {
    private String name;
    private RangeMapHandler rangeMapHandler = new RangeMapHandler();

    public Student(String name) {
        this.name = name;
    }

    public void enrollInCourse(int courseStart, int courseEnd, String courseName) {
        rangeMapHandler.addRange(courseStart, courseEnd, courseName);
    }

    public String getCourse(int day) {
        return rangeMapHandler.getValue(day);
    }
}
