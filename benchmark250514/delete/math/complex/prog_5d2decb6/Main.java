import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a column matrix with some values
        double[][] columnData = { {1.0}, {2.0}, {3.0} };

        // Create the column real matrix using the write method
        /* write */ RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(columnData);

        // Create another matrix for additional complexity
        double[][] additionalData = { {4.0, 5.0}, {6.0, 7.0}, {8.0, 9.0} };
        RealMatrix additionalMatrix = MatrixUtils.createRealMatrix(additionalData);

        // Perform matrix operations
        RealMatrix sumMatrix = columnMatrix.add(additionalMatrix);
        RealMatrix productMatrix = columnMatrix.multiply(additionalMatrix.transpose());

        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[] {10.0, 20.0, 30.0});
        RealVector resultVector = vector.add(new ArrayRealVector(new double[] {1.0, 2.0, 3.0}));

        // Use the read method to read the column matrix
        /* read */ RealMatrix readMatrix = MatrixUtils.getColumnRealMatrix(columnMatrix, 0);

        // Print the values of the read matrix to verify
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            System.out.println(readMatrix.getEntry(i, 0));
        }

        // Print results of matrix operations
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("Product Matrix:");
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                System.out.print(productMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print results of vector operations
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
    }
}