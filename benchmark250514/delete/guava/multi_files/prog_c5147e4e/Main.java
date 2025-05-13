public class Main {
    public static void main(String[] args) {
        // Create a course
        Course course = new Course("Mathematics");

        // Create a student and add scores
        Student student = new Student("Alice", 20);
        student.addScore(95);
        student.addScore(88);
        course.addStudent(student);

        // Retrieve scores using ImmutableListReader
        ImmutableListReader reader = new ImmutableListReader();
        int firstScore = reader.readFirstElement(student.getScores());
        System.out.println("First score of student " + student.name + ": " + firstScore);

        // Display all students in the course
        for (Student s : course.getStudents()) {
            System.out.println("Student: " + s.name + ", Age: " + s.age);
        }
    }
}