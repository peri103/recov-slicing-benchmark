public class Main {
    public static void main(String[] args) {
        // Initialize data writer and write data
        ImmutableDataWriter dataWriter = new ImmutableDataWriter();
        dataWriter.writeData();

        // Initialize data reader and read data
        ImmutableDataReader dataReader = new ImmutableDataReader(dataWriter.getMutableMap());
        String value = dataReader.readData();
        System.out.println(value);

        // Create students and courses
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Enroll students in courses
        math.enrollStudent(alice);
        science.enrollStudent(bob);

        // Enroll students in courses
        alice.enrollInCourse(math);
        bob.enrollInCourse(science);

        // Print student details
        for (Student student : math.getEnrolledStudents()) {
            System.out.println(student.getName() + " is enrolled in " + math.getCourseName());
        }
        for (Student student : science.getEnrolledStudents()) {
            System.out.println(student.getName() + " is enrolled in " + science.getCourseName());
        }
    }
}