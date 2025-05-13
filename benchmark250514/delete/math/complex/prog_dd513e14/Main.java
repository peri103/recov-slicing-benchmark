import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        /* write */ RealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);
        
        // Create another matrix for demonstration purposes
        double[][] data2 = {
            {5.0, 6.0},
            {7.0, 8.0}
        };
        RealMatrix anotherMatrix = MatrixUtils.createBlockRealMatrix(data2);

        // Perform some operations with anotherMatrix
        RealMatrix sumMatrix = matrix.add(anotherMatrix);
        RealMatrix productMatrix = matrix.multiply(anotherMatrix);

        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0});
        RealVector resultVector = matrix.operate(vector);

        // Print results of operations
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

        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Original read operation
        /* read */ RealMatrix readMatrix = matrix.getSubMatrix(0, 1, 0, 1);

        // Print the read matrix
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}