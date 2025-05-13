public class Main {
    public static void main(String[] args) {
        // Using ImmutableMapBuilder and DataProcessor
        ImmutableMapBuilder mapBuilder = new ImmutableMapBuilder();
        mapBuilder.addEntry("key", 42);
        ImmutableSortedMap<String, Integer> map = mapBuilder.build();
        DataProcessor processor = new DataProcessor(map);
        Integer value = processor.getValue("key");
        System.out.println("Value from map: " + value);

        // Creating students and course
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        Course course = new Course("Mathematics");
        course.addStudent(student1);
        course.addStudent(student2);

        // Display course and student information
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getId());
        }
    }
}