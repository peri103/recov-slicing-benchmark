import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] row = {1.0, 2.0, 3.0};
        double[] anotherRow = {4.0, 5.0, 6.0};

        // Create another matrix to make the program more complex
        RealMatrix anotherMatrix = MatrixUtils.createRowRealMatrix(anotherRow);

        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(new double[]{7.0, 8.0, 9.0});
        RealVector resultVector = vector.mapAdd(2.0);
        
        // Print the vector to show some operations
        System.out.println("Result Vector: " + resultVector);

        // Perform a matrix operation
        RealMatrix matrixSum = anotherMatrix.add(anotherMatrix);
        System.out.println("Matrix Sum: " + matrixSum);

        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(row);

        // More operations unrelated to the main task
        RealMatrix productMatrix = anotherMatrix.multiply(matrixSum);
        System.out.println("Product Matrix: " + productMatrix);

        // Using the matrix in different ways
        RealVector extractedRow = matrix.getRowVector(0);
        System.out.println("Extracted Row: " + extractedRow);

        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix, 0);
        System.out.println("Read Matrix: " + readMatrix);

        // Final operations to make the program more complex
        RealMatrix finalMatrix = readMatrix.scalarMultiply(2.0);
        System.out.println("Final Matrix: " + finalMatrix);
    }
}