import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        // Write the 2D array to a RealMatrix object using MatrixUtils
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Additional complex operations
        RealVector vector = new ArrayRealVector(new double[]{5.0, 6.0});
        RealMatrix resultMatrix = matrix.add(matrix); // Matrix addition
        RealMatrix multipliedMatrix = resultMatrix.scalarMultiply(2.0); // Scalar multiplication
        
        // Modify the matrix using a visitor
        multipliedMatrix.walkInOptimizedOrder(new RealMatrixChangingVisitor() {
            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
                // Initialization if needed
            }

            @Override
            public double visit(int row, int column, double value) {
                return value + 1; // Increment each element by 1
            }

            @Override
            public double end() {
                return 0; // Finalize if needed
            }
        });
        
        // Read the 2D array from the RealMatrix object
        /* read */ double[][] readData = matrix.getData();
        
        // Print the read data
        for (int i = 0; i < readData.length; i++) {
            for (int j = 0; j < readData[i].length; j++) {
                System.out.print(readData[i][j] + " ");
            }
            System.out.println();
        }

        // Print the modified matrix
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform vector operations
        RealVector resultVector = vector.mapMultiply(2.0).mapAdd(3.0); // Vector operations
        System.out.println("Modified vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
    }
}