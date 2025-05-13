public class Main {
    public static void main(String[] args) {
        // Initialize MatrixHandler and create a column matrix
        MatrixHandler matrixHandler = new MatrixHandler();
        double[] data = {1.0, 2.0, 3.0};
        matrixHandler.createMatrix(data);

        // Initialize Course and add students
        Course course = new Course("Math 101");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        alice.addGrade(85.5);
        bob.addGrade(90.0);
        course.addStudent(alice);
        course.addStudent(bob);

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Grades: " + student.getGrades());
        }

        // Retrieve and print the column matrix
        /* read */ RealMatrix columnMatrix = matrixHandler.getColumnMatrix(0);
        System.out.println("Column matrix:");
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }
    }
}