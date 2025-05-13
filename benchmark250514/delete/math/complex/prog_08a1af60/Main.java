import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Create a column real vector using the write method
        RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{5.0, 6.0});
        
        // Set the column vector to the matrix at column index 0
        matrix.setColumnVector(0, columnVector);
        
        // Perform matrix operations
        RealMatrixChangingVisitor visitor = new RealMatrixChangingVisitor() {
            @Override
            public double visit(int row, int column, double value) {
                return value * 2; // Double each element
            }

            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                // No initialization needed
            }

            @Override
            public double end() {
                return 0; // No final computation needed
            }
        };
        
        matrix.walkInOptimizedOrder(visitor);
        
        // Additional operations using RealMatrix and RealVector
        RealVector rowVector = matrix.getRowVector(0);
        RealVector resultVector = rowVector.mapAdd(10.0); // Add 10 to each element of the row vector
        
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println("Result Vector Entry " + i + ": " + resultVector.getEntry(i));
        }
        
        // Get the column real vector using the read method
        /* read */ RealVector readColumnVector = matrix.getColumnVector(0);
        
        // Print the values of the read column vector
        for (int i = 0; i < readColumnVector.getDimension(); i++) {
            System.out.println("Read Column Vector Entry " + i + ": " + readColumnVector.getEntry(i));
        }
        
        // Additional complex operations
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(2);
        RealMatrix multipliedMatrix = matrix.multiply(identityMatrix);
        
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}