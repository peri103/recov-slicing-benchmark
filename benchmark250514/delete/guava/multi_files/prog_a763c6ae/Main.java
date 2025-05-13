import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        // Create and use ImmutableRangeMapBuilder
        ImmutableRangeMapBuilder rangeMapBuilder = new ImmutableRangeMapBuilder();
        rangeMapBuilder.addRange(Range.closed(1, 10), "Value in range");

        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = rangeMapBuilder.build();

        // Use RangeMapReader to read from the ImmutableRangeMap
        RangeMapReader rangeMapReader = new RangeMapReader(rangeMap);
        String value = rangeMapReader.getValue(5);
        System.out.println("ImmutableRangeMap Value: " + value);

        // Create Student and Course objects for additional complexity
        Student student = new Student("Alice");
        Course course = new Course("Mathematics");
        course.addStudent(student);
        student.enrollCourse(course.getCourseName());

        // Print student and course information
        System.out.println("Student Name: " + student.getName());
        System.out.println("Enrolled Courses: " + student.getCourses());
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Students in Course: " + course.getStudents().get(0).getName());
    }
}