import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a matrix with a single row
        double[][] data = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a row vector using the write method
        RealVector rowVector = MatrixUtils.createRowRealVector(data[0]);
        /* write */ matrix.setRowVector(0, rowVector);

        // Additional complex operations
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(new double[][]{{4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}});
        RealMatrix sumMatrix = matrix.add(anotherMatrix);
        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        RealVector columnVector = anotherMatrix.getColumnVector(1);
        System.out.println("Column Vector from anotherMatrix: " + columnVector);

        double[][] data2 = {{10.0, 11.0, 12.0}};
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(data2);
        RealVector rowVector2 = MatrixUtils.createRowRealVector(data2[0]);
        matrix2.setRowVector(0, rowVector2);
        
        // Read the row vector using the read method
        /* read */ RealVector readVector = matrix.getRowVector(0);
        
        // Print the read vector
        System.out.println("Read Vector from matrix: " + readVector);

        // Further complex operations
        RealMatrix productMatrix = matrix2.multiply(anotherMatrix);
        System.out.println("Product Matrix:");
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                System.out.print(productMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}