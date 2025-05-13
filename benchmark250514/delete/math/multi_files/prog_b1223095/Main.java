import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        
        MatrixOperations matrixOps = new MatrixOperations();
        matrixOps.createMatrix(data);

        // Adding complexity: Transpose the matrix
        RealMatrix matrix = matrixOps.getMatrix();
        RealMatrix transposedMatrix = matrix.transpose();
        
        // Adding complexity: Create a vector and multiply it with the matrix
        RealVector vector = new ArrayRealVector(new double[]{1.0, 1.0, 1.0});
        RealVector resultVector = transposedMatrix.operate(vector);
        
        // Print the result of the vector multiplication
        System.out.println("Resulting vector after matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Use MatrixManipulator to modify the matrix
        MatrixManipulator manipulator = new MatrixManipulator();
        manipulator.incrementMatrixElements(matrix);

        // Perform some unrelated operations
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * 2.5;
        }
        System.out.println("Sum of the first ten multiples of 2.5: " + sum);
        
        // More unrelated operations
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);

        // Finally, read the matrix data back
        /* read */ double[][] readData = matrix.getData();
        
        System.out.println("Matrix after all operations:");
        for (double[] row : readData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}