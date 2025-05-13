import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Matrix operations
        MatrixOperations matrixOps = new MatrixOperations();
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        matrixOps.createMatrix(data);

        // Course and student operations
        Course course = new Course("Mathematics");
        Student alice = new Student("Alice");
        alice.addGrade(85.0);
        alice.addGrade(90.0);
        course.addStudent(alice);

        Student bob = new Student("Bob");
        bob.addGrade(78.0);
        bob.addGrade(82.0);
        course.addStudent(bob);

        System.out.println("Course Average: " + course.getCourseAverage());

        // Retrieve and print the matrix
        BlockRealMatrix retrievedMatrix = matrixOps.getMatrix();
        /* read */ System.out.println("Retrieved matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}