import org.apache.commons.math3.linear.SparseRealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        SparseRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        
        // Initialize another matrix for complex operations
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(3, 3);
        matrix2.setEntry(0, 0, 2.0);
        matrix2.setEntry(1, 1, 3.0);
        matrix2.setEntry(2, 2, 4.0);

        // Perform some matrix operations
        RealMatrix resultMatrix = matrix2.scalarAdd(1.0);
        System.out.println("Result Matrix after scalar addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform some unrelated calculations
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += Math.sqrt(i);
        }
        System.out.println("Sum of square roots: " + sum);

        // Original write operation
        /* write */ matrix.setEntry(0, 0, 5.0);

        // Further operations with matrix2
        RealMatrix transposedMatrix = matrix2.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Original read operation
        /* read */ double value = matrix.getEntry(0, 0);
        System.out.println("Read value: " + value);

        // More complex calculations
        RealMatrix multipliedMatrix = matrix2.multiply(transposedMatrix);
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}