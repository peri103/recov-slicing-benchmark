import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] columnData = {1.0, 2.0, 3.0};

        // Creating a matrix using the write method
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(columnData);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix: ");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Create another matrix and perform addition
        RealMatrix anotherMatrix = MatrixUtils.createColumnRealMatrix(new double[]{4.0, 5.0, 6.0});
        RealMatrix sumMatrix = matrix.add(anotherMatrix);
        System.out.println("Sum Matrix: ");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Create a vector and perform multiplication
        RealVector vector = new ArrayRealVector(new double[]{1.0, 1.0, 1.0});
        RealVector resultVector = matrix.operate(vector);
        System.out.println("Result Vector: ");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Read the column matrix using the read method
        /* read */ RealMatrix columnMatrix = matrix.getColumnMatrix(0);
        
        System.out.println("Column Matrix: ");
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }
    }
}