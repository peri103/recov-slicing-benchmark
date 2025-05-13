public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Alice");
        
        // Add an instance to the student's map
        student.addInstance(String.class, "Hello, World!");
        
        // Create a Course object
        Course course = new Course("Mathematics");
        
        // Enroll the student in the course
        course.enrollStudent(student.getName());
        
        // Print enrolled students in the course
        System.out.println("Enrolled students in " + course.getCourseName() + ":");
        for (String studentName : course.getEnrolledStudents()) {
            System.out.println(studentName);
        }
        
        // Retrieve the immutable map from the student
        ImmutableClassToInstanceMap<Object> immutableMap = student.getImmutableMap();
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares from 1 to 5: " + sum);
        
        // Use the read method to retrieve the instance
        /* read */ String value = immutableMap.getInstance(String.class);
        
        // Print the retrieved value
        System.out.println(value);
    }
}