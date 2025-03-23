public class Main {
    public static void main(String[] args) {
        RangeMapStorage rangeMapStorage = new RangeMapStorage();
        rangeMapStorage.addRange(1, 5, "Value1");

        // Create a course and add students
        Course course = new Course("Mathematics");
        Student student = new Student("Alice");
        student.addScore(90);
        course.addStudent(student);

        // Print student scores
        for (Student s : course.getStudents()) {
            System.out.println(s.getScores());
        }

        /* read */ String value = rangeMapStorage.getValue(3);
        System.out.println(value);
    }
}