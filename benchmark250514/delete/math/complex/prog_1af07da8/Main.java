import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrixChangingVisitor;

public class Main {
    public static void main(String[] args) {
        // Define a symmetric matrix using MatrixUtils
        double[][] data = {
            {1.0, 0.5, 0.3},
            {0.5, 1.0, 0.4},
            {0.3, 0.4, 1.0}
        };
        
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);

        // Create a vector and perform some operations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 2.0, 3.0});
        RealVector resultVector = symmetricMatrix.operate(vector);

        // Modify the matrix using a visitor
        symmetricMatrix.walkInOptimizedOrder(new RealMatrixChangingVisitor() {
            @Override
            public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {}

            @Override
            public double visit(int row, int column, double value) {
                return value * 2; // Double each element
            }

            @Override
            public double end() {
                return 0;
            }
        });

        // Perform some unrelated computations
        double sum = 0;
        for (int i = 0; i < resultVector.getDimension(); i++) {
            sum += resultVector.getEntry(i);
        }
        System.out.println("Sum of result vector: " + sum);

        // More complex operations
        RealMatrix anotherMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix multipliedMatrix = symmetricMatrix.multiply(anotherMatrix);

        // Finally read the symmetric matrix
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);
        
        // Print the retrieved matrix to verify the correct value
        System.out.println("Retrieved Symmetric Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < retrievedMatrix.getColumnDimension(); j++) {
                System.out.print(retrievedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}