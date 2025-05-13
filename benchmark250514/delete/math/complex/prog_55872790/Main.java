import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] diagonalValues = {1.0, 2.0, 3.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createDiagonalMatrix(diagonalValues);
        
        // Create another matrix and perform matrix addition
        double[][] data = {
            {1.0, 0.0, 0.0},
            {0.0, 1.0, 0.0},
            {0.0, 0.0, 1.0}
        };
        RealMatrix identityMatrix = new Array2DRowRealMatrix(data);
        
        RealMatrix sumMatrix = matrix.add(identityMatrix);
        System.out.println("Sum Matrix:");
        for (int row = 0; row < sumMatrix.getRowDimension(); row++) {
            for (int col = 0; col < sumMatrix.getColumnDimension(); col++) {
                System.out.print(sumMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
        
        // Create a vector and perform matrix-vector multiplication
        double[] vectorData = {1.0, 2.0, 3.0};
        RealVector vector = new ArrayRealVector(vectorData);
        
        RealVector resultVector = matrix.operate(vector);
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // More complex operations
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int row = 0; row < transposedMatrix.getRowDimension(); row++) {
            for (int col = 0; col < transposedMatrix.getColumnDimension(); col++) {
                System.out.print(transposedMatrix.getEntry(row, col) + " ");
            }
            System.out.println();
        }
        
        /* read */ double[] readDiagonalValues = matrix.getRow(0);
        
        System.out.println("Read Diagonal Values:");
        for (double value : readDiagonalValues) {
            System.out.println(value);
        }
    }
}