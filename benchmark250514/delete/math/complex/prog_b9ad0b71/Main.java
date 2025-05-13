import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        // Create another matrix for additional complexity
        double[][] data2 = {
            {5.0, 6.0},
            {7.0, 8.0}
        };
        RealMatrix matrix2 = MatrixUtils.createBlockRealMatrix(data2);

        // Perform some operations on the second matrix
        RealMatrix sumMatrix = matrix2.add(MatrixUtils.createBlockRealMatrix(data));
        RealVector columnVector = matrix2.getColumnVector(0);

        // Print the column vector
        System.out.println("Column Vector:");
        for (int i = 0; i < columnVector.getDimension(); i++) {
            System.out.print(columnVector.getEntry(i) + " ");
        }
        System.out.println();

        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Perform some unrelated calculations
        double sum = 0.0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                sum += data[i][j];
            }
        }
        System.out.println("Sum of original data: " + sum);

        // Use the sumMatrix for further operations
        RealMatrix multipliedMatrix = sumMatrix.scalarMultiply(2.0);

        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ double[][] retrievedData = matrix.getData();

        // Print the retrieved data from the original matrix
        System.out.println("Retrieved Data:");
        for (int i = 0; i < retrievedData.length; i++) {
            for (int j = 0; j < retrievedData[i].length; j++) {
                System.out.print(retrievedData[i][j] + " ");
            }
            System.out.println();
        }
    }
}