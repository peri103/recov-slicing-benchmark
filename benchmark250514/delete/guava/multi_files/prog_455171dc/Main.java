public class Main {
    public static void main(String[] args) {
        // Create a new ImmutableTableWrapper and put a value
        ImmutableTableWrapper tableWrapper = new ImmutableTableWrapper();
        tableWrapper.putValue("row1", "column1", 42);
        
        // Build the table
        ImmutableTable<String, String, Integer> table = tableWrapper.buildTable();
        
        // Process the table to get the value
        DataProcessor processor = new DataProcessor(table);
        Integer value = processor.getValue("row1", "column1");
        
        // Print the value
        System.out.println("Value from table: " + value);
        
        // Create a course and add students
        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));
        
        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}