import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a row vector
        double[] rowData = {1.0, 2.0, 3.0};

        // Create a row real matrix using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);

        // Create another matrix for complex operations
        double[][] complexData = {
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0},
            {10.0, 11.0, 12.0}
        };
        RealMatrix complexMatrix = new Array2DRowRealMatrix(complexData);

        // Perform matrix addition
        RealMatrix resultMatrix = matrix.add(complexMatrix);

        // Print the result of matrix addition
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Create a vector and perform operations
        double[] vectorData = {1.0, 2.0, 3.0};
        RealVector vector = new ArrayRealVector(vectorData);

        // Multiply the vector with the original matrix
        RealVector multipliedVector = matrix.operate(vector);

        // Print the multiplied vector
        System.out.println("Multiplied vector:");
        for (int i = 0; i < multipliedVector.getDimension(); i++) {
            System.out.print(multipliedVector.getEntry(i) + " ");
        }
        System.out.println();

        // Read the row real matrix back using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix.getData(), 0);

        // Print the read matrix
        System.out.println("Read matrix:");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
        System.out.println();
    }
}