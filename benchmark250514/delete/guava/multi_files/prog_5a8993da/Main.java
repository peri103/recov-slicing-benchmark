public class Main {
    public static void main(String[] args) {
        // Use RangeMapBuilder to add ranges
        RangeMapBuilder rangeMapBuilder = new RangeMapBuilder();
        rangeMapBuilder.addRange(0, 10, "Value1");
        rangeMapBuilder.addRange(20, 30, "Value2");

        // Build the range map
        ImmutableRangeMap<Integer, String> rangeMap = rangeMapBuilder.build();

        // Use RangeReader to read values
        RangeReader rangeReader = new RangeReader(rangeMap);
        String value = rangeReader.readValue(5);
        System.out.println("Read from ImmutableRangeMap: " + value);

        // Create a Course and add Students
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        // Print Course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}