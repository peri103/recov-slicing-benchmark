import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Matrix operations
        MatrixOperations matrixOps = new MatrixOperations();
        matrixOps.createIdentityMatrix(3);

        // Student and course operations
        Student student1 = new Student("Alice");
        student1.addGrade(85.5);
        student1.addGrade(90.0);

        Student student2 = new Student("Bob");
        student2.addGrade(78.0);
        student2.addGrade(82.5);

        Course course = new Course("Mathematics");
        course.addStudent(student1);
        course.addStudent(student2);

        // Display student information
        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName());
            System.out.println("Average Grade: " + student.getAverageGrade());
        }

        // Reading the identity matrix
        /* read */ RealMatrix readMatrix = matrixOps.getIdentityMatrix();

        // Displaying the identity matrix
        System.out.println("Identity Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}