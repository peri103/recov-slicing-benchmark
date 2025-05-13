public class Main {
    public static void main(String[] args) {
        RangeMapHandler rangeMapHandler = new RangeMapHandler();
        rangeMapHandler.addRange(1, 10, "Hello");

        Student student = new Student("Alice");
        Course course = new Course("Mathematics");
        student.enrollInCourse(course);

        System.out.println("Courses enrolled by Alice:");
        for (Course c : student.getCourses()) {
            System.out.println(c.getStudents());
        }

        /* read */ String value = rangeMapHandler.getValue(5);
        System.out.println("Read value: " + value);
    }
}