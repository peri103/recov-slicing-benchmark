import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one column
        double[][] data = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a column vector using the write method
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});

        // Perform some unrelated operations
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(new double[][]{{7.0, 8.0}, {9.0, 10.0}, {11.0, 12.0}});
        RealVector anotherVector = new ArrayRealVector(new double[]{13.0, 14.0, 15.0});
        
        // Add the column vector to another vector
        RealVector sumVector = columnVector.add(anotherVector);
        System.out.println("Sum Vector:");
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.println(sumVector.getEntry(i));
        }

        // Multiply the matrix by another matrix
        RealMatrix productMatrix = matrix.multiply(anotherMatrix);
        System.out.println("Product Matrix:");
        for (int row = 0; row < productMatrix.getRowDimension(); row++) {
            for (int col = 0; col < productMatrix.getColumnDimension(); col++) {
                System.out.print(productMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }

        // Replace the first column of the matrix with the new column vector
        matrix.setColumnVector(0, columnVector);

        // More unrelated operations
        RealVector scaledVector = columnVector.mapMultiply(2.0);
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.println(scaledVector.getEntry(i));
        }

        // Read the column vector using the read method
        /* read */ RealVector readColumnVector = matrix.getColumnVector(0);

        // Print the values of the read column vector
        System.out.println("Read Column Vector:");
        for (int i = 0; i < readColumnVector.getDimension(); i++) {
            System.out.println(readColumnVector.getEntry(i));
        }
    }
}