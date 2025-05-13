public class Main {
    public static void main(String[] args) {
        // Manage ValueAxis
        ValueAxisManager axisManager = new ValueAxisManager();
        axisManager.setInitialRange(0.0, 10.0);

        // Read the range
        RangeReader rangeReader = new RangeReader(axisManager.getValueAxis());
        Range readRange = rangeReader.readRange();
        System.out.println("Final Range: " + readRange);

        // Manage a Course
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 1));
        course.addStudent(new Student("Bob", 2));

        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getStudentId());
        }
    }
}