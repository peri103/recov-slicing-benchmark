public class Main {
    public static void main(String[] args) {
        AtomicDoubleHandler atomicDoubleHandler = new AtomicDoubleHandler();
        atomicDoubleHandler.addValue(5.0);

        Course course = new Course("Mathematics");
        Student student = new Student("Alice");
        student.addGrade(90.0);
        student.addGrade(85.5);
        course.enrollStudent(student);

        // Print enrolled students
        System.out.println("Enrolled Students in " + course.getCourseName() + ":");
        for (Student enrolledStudent : course.getStudents()) {
            System.out.println("Student Name: " + enrolledStudent.getName());
        }

        /* read */ double value = atomicDoubleHandler.getValue();
        System.out.println("Read Value from AtomicDouble: " + value);
    }
}