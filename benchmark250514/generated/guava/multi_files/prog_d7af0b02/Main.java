import com.google.common.collect.ImmutableRangeMap;

public class Main {
    public static void main(String[] args) {
        // Use RangeMapBuilder to create a range map
        RangeMapBuilder rangeMapBuilder = new RangeMapBuilder();
        rangeMapBuilder.addRange(1, 10, "Value1");
        ImmutableRangeMap<Integer, String> rangeMap = rangeMapBuilder.build();

        // Use RangeMapReader to read from the range map
        RangeMapReader rangeMapReader = new RangeMapReader(rangeMap);
        String value = rangeMapReader.getValue(5);
        System.out.println(value);

        // Create a student and enroll in courses
        Student student = new Student("John Doe");
        student.enrollCourse("Mathematics");
        student.enrollCourse("Physics");

        // Print student information
        System.out.println("Student Name: " + student.getName());
        System.out.println("Enrolled Courses: " + student.getCourses());
    }
}