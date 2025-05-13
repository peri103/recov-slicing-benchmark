import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0}, {2.0}, {3.0}};
        double[] vectorData = {4.0, 5.0, 6.0};

        // Create a vector
        RealVector vector = new ArrayRealVector(vectorData);

        // Perform some vector operations
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);

        // Create another matrix
        RealMatrix anotherMatrix = MatrixUtils.createColumnRealMatrix(new double[][]{{7.0}, {8.0}, {9.0}});

        // Perform matrix addition
        RealMatrix sumMatrix = anotherMatrix.add(MatrixUtils.createColumnRealMatrix(data));
        System.out.println("Sum of Matrices:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            System.out.println(sumMatrix.getEntry(i, 0));
        }

        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(data);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getColumnDimension(); i++) {
            System.out.println(transposedMatrix.getEntry(0, i));
        }

        // More operations
        RealMatrix multipliedMatrix = matrix.scalarMultiply(3.0);
        System.out.println("Scalar Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            System.out.println(multipliedMatrix.getEntry(i, 0));
        }

        /* read */ RealMatrix columnMatrix = matrix.getColumnMatrix(0);

        // Output the column matrix
        System.out.println("Column Matrix:");
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }
    }
}