import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize matrix data
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };

        // Create a vector
        RealVector vector = new ArrayRealVector(new double[]{10.0, 20.0, 30.0});

        // Perform vector operations
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();

        // Create another matrix for operations
        double[][] additionalData = {
            {9.0, 8.0, 7.0},
            {6.0, 5.0, 4.0},
            {3.0, 2.0, 1.0}
        };
        RealMatrix additionalMatrix = MatrixUtils.createBlockRealMatrix(additionalData);

        // Matrix addition
        RealMatrix resultMatrix = additionalMatrix.add(MatrixUtils.createRealMatrix(data));
        System.out.println("Result Matrix after Addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Original write method
        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Perform some unrelated operations
        double sum = 0.0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                sum += data[i][j];
            }
        }
        System.out.println("Sum of original data: " + sum);

        // Original read method
        /* read */ double[][] readData = matrix.getData();

        // Print the matrix to verify the read operation
        System.out.println("Read Matrix:");
        for (int i = 0; i < readData.length; i++) {
            for (int j = 0; j < readData[i].length; j++) {
                System.out.print(readData[i][j] + " ");
            }
            System.out.println();
        }
    }
}