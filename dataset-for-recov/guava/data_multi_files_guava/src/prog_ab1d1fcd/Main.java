public class Main {
    public static void main(String[] args) {
        OptionalValue optionalValue = new OptionalValue(42);
        Course course = new Course("Mathematics");
        Student student = new Student("Alice");
        student.addScore(95);
        course.addStudent(student);

        /* read */ int value = optionalValue.getOptionalValue().get();
        System.out.println("Value from Optional: " + value);
        
        for (Student s : course.getStudents()) {
            System.out.println("Student Name: " + s.getScores());
        }
    }
}