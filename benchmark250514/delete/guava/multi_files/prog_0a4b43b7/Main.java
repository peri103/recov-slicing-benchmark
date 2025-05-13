import com.google.common.collect.ImmutableClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        // Create a CustomMapBuilder to add entries
        CustomMapBuilder mapBuilder = new CustomMapBuilder();
        
        // Add a String instance to the map
        mapBuilder.addEntry(String.class, "Hello, World!");
        
        // Build the map
        ImmutableClassToInstanceMap<Object> map = mapBuilder.build();
        
        // Create a CustomMapReader to read entries
        CustomMapReader mapReader = new CustomMapReader(map);
        
        // Retrieve the String instance
        String value = mapReader.getInstance(String.class);
        System.out.println(value);
        
        // Create a Course and add Students
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));
        
        // Output student details
        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}