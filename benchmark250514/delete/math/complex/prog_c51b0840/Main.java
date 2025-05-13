import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initializing a row of data
        double[] rowData = {1.0, 2.0, 3.0};

        // Create a vector using ArrayRealVector
        RealVector vector = new ArrayRealVector(rowData);
        
        // Perform some operations on the vector
        RealVector scaledVector = vector.mapMultiply(2.0);
        RealVector addedVector = vector.add(scaledVector);

        // Print the scaled and added vectors
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println("\nAdded Vector:");
        for (int i = 0; i < addedVector.getDimension(); i++) {
            System.out.print(addedVector.getEntry(i) + " ");
        }
        System.out.println();

        // Create another matrix using MatrixUtils
        RealMatrix anotherMatrix = MatrixUtils.createRowRealMatrix(new double[]{4.0, 5.0, 6.0});
        
        // Perform matrix addition
        RealMatrix resultMatrix = anotherMatrix.add(MatrixUtils.createRowRealMatrix(rowData));

        // Print the result of matrix addition
        System.out.println("Result Matrix after addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);

        // Perform some unrelated operations
        RealMatrix multipliedMatrix = matrix.scalarMultiply(3.0);
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix, 0);

        // Print the read matrix to verify the value
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
    }
}