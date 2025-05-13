import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a row matrix using MatrixUtils
        double[] rowData = {1.0, 2.0, 3.0};
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);

        // Perform some operations on the matrix
        RealMatrix matrix2 = MatrixUtils.createRowRealMatrix(new double[]{4.0, 5.0, 6.0});
        RealMatrix sumMatrix = matrix.add(matrix2);
        System.out.println("Sum matrix: ");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{7.0, 8.0, 9.0});
        RealVector resultVector = vector.mapAdd(1.0);
        System.out.println("Result vector after addition: ");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Read the row matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = matrix.getRowMatrix(0);
        
        // Output the read matrix
        System.out.println("Read matrix row: ");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
    }
}