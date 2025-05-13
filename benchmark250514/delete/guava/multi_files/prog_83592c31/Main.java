import com.google.common.collect.ImmutableClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        // Create and populate the ImmutableMapBuilder
        ImmutableMapBuilder mapBuilder = new ImmutableMapBuilder();
        mapBuilder.addValue(String.class, "Hello, World!");
        mapBuilder.addAdditionalValues();
        
        // Build the map
        ImmutableClassToInstanceMap<Object> map = mapBuilder.buildMap();

        // Create the ImmutableMapReader to read from the map
        ImmutableMapReader mapReader = new ImmutableMapReader(map);

        // Retrieve and print the String instance
        String stringValue = mapReader.getStringInstance();
        System.out.println("String value: " + stringValue);

        // Retrieve and print the Integer and Double instances
        Integer intValue = mapReader.getIntegerInstance();
        Double doubleValue = mapReader.getDoubleInstance();
        System.out.println("Integer value: " + intValue);
        System.out.println("Double value: " + doubleValue);

        // Create a course and add students
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}