import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a student and add scores
        Student student = new Student("Bob");
        student.addScore(85);
        student.addScore(90);

        // Retrieve and print a score
        int score = student.getScore(0);
        System.out.println("Student's first score: " + score);

        // Perform matrix operations
        MatrixOperations matrixOps = new MatrixOperations();
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        RealMatrix matrix = matrixOps.createMatrix(data);

        // Retrieve matrix data and print it
        double[][] retrievedData = matrixOps.getMatrixData(matrix);
        System.out.println("Matrix Data:");
        for (double[] row : retrievedData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}