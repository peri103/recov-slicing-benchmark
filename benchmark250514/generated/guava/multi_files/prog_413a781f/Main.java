import com.google.common.collect.ImmutableRangeMap;

public class Main {
    public static void main(String[] args) {
        // Create a RangeMapBuilder and add ranges
        RangeMapBuilder rangeMapBuilder = new RangeMapBuilder();
        rangeMapBuilder.addRange(1, 10, "Value1");
        rangeMapBuilder.addRange(11, 20, "Value2");

        // Build the range map
        ImmutableRangeMap<Integer, String> rangeMap = rangeMapBuilder.buildRangeMap();

        // Create a RangeMapReader to read values
        RangeMapReader rangeMapReader = new RangeMapReader(rangeMap);
        String value = rangeMapReader.getValue(5);
        System.out.println("RangeMap Value: " + value);

        // Create a Course and add students
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 1));
        course.addStudent(new Student("Bob", 2));

        // Print enrolled students
        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Enrolled Student: " + student);
        }
    }
}