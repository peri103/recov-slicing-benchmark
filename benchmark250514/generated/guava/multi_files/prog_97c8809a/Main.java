import com.google.common.collect.ImmutableRangeMap;

public class Main {
    public static void main(String[] args) {
        // Create a RangeMapBuilder and add a range
        RangeMapBuilder rangeMapBuilder = new RangeMapBuilder();
        rangeMapBuilder.addRange(1, 10, "Value");

        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = rangeMapBuilder.build();

        // Create a RangeMapReader to read values from the range map
        RangeMapReader rangeMapReader = new RangeMapReader(rangeMap);

        // Read the value for a specific key within the range
        String value = rangeMapReader.getValue(5);

        // Output the read value
        System.out.println("Read Value: " + value);

        // Create a course and add students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        course.addStudent(student1);
        course.addStudent(student2);

        // Output the students in the course
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}