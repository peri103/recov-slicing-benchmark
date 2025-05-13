import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        // Define a 2D array to be used for matrix creation
        double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        
        // Create a 2D row real matrix using the MatrixUtils class
        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        
        // Perform some operations on the matrix
        RealMatrix resultMatrix = matrix.transpose(); // Transpose the matrix

        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[] {1.0, 0.0, -1.0});
        RealVector multipliedVector = matrix.operate(vector); // Matrix-vector multiplication
        
        // Print the result of matrix-vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < multipliedVector.getDimension(); i++) {
            System.out.print(multipliedVector.getEntry(i) + " ");
        }
        System.out.println();

        // Modify the matrix using a visitor
        matrix.walkInRowOrder(new RealMatrixChangingVisitor() {
            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {}

            @Override
            public double visit(int row, int column, double value) {
                return value + 1.0; // Increment each element by 1
            }

            @Override
            public double end() {
                return 0;
            }
        });

        // Retrieve the 2D row real matrix using the MatrixUtils class
        /* read */ double[][] retrievedData = matrix.getData();
        
        // Print the retrieved matrix data to verify
        System.out.println("Modified matrix data:");
        for (double[] row : retrievedData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}