public class Main {
    public static void main(String[] args) {
        // Create a vector and set an entry
        VectorOperations vectorOps = new VectorOperations();
        vectorOps.setVectorEntry(0, 3.14);

        // Create a student and course
        Student student = new Student("Alice");
        Course course = new Course("Math 101");
        course.addStudent(student);

        // Analyze the vector
        VectorAnalyzer analyzer = new VectorAnalyzer(vectorOps.getVector());
        double value = analyzer.getVectorEntry(0);
        System.out.println("Value from vector: " + value);

        // Display course information
        for (Student s : course.getStudents()) {
            System.out.println("Student enrolled in " + course.getCourseName() + ": " + s.getName());
        }
    }
}