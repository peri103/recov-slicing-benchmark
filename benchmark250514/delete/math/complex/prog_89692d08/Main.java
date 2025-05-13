import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row
        double[][] data = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a vector to write into the matrix
        RealVector vector = MatrixUtils.createRowRealVector(new double[]{4.0, 5.0, 6.0});

        // Write the vector into the first row of the matrix
        /* write */ matrix.setRowVector(0, vector);

        // Perform some unrelated matrix operations
        double[][] additionalData = {{7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}};
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalData);
        RealMatrix combinedMatrix = matrix.add(additionalMatrix);

        System.out.println("Combined matrix:");
        for (int i = 0; i < combinedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < combinedMatrix.getColumnDimension(); j++) {
                System.out.print(combinedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // More unrelated code
        double[][] subtractData = {{1.0, 1.0, 1.0}};
        RealMatrix subtractMatrix = new Array2DRowRealMatrix(subtractData);
        RealMatrix resultMatrix = combinedMatrix.subtract(subtractMatrix);

        System.out.println("Result matrix after subtraction:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the vector from the first row of the matrix
        /* read */ RealVector readVector = matrix.getRowVector(0);

        // Print the read vector
        System.out.println("Read vector: " + readVector);
    }
}