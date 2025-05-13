import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a row matrix using the write method
        double[] rowData = {1.0, 2.0, 3.0};
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);

        // Additional computation with the matrix
        RealVector vector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector resultVector = matrix.operate(vector);
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Create another matrix and perform matrix addition
        RealMatrix anotherMatrix = MatrixUtils.createRowRealMatrix(new double[]{7.0, 8.0, 9.0});
        RealMatrix sumMatrix = matrix.add(anotherMatrix);
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < sumMatrix.getColumnDimension(); i++) {
            System.out.print(sumMatrix.getEntry(0, i) + " ");
        }
        System.out.println();

        // Read the same row matrix using the read method
        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix.getData(), 0);
        
        // Print the matrix to verify
        System.out.println("Read matrix:");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
        System.out.println();

        // Perform scalar multiplication on the read matrix
        RealMatrix scaledMatrix = readMatrix.scalarMultiply(2.0);
        System.out.println("Scaled matrix:");
        for (int i = 0; i < scaledMatrix.getColumnDimension(); i++) {
            System.out.print(scaledMatrix.getEntry(0, i) + " ");
        }
        System.out.println();
    }
}