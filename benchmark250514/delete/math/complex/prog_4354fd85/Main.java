import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a symmetric matrix using MatrixUtils
        double[][] data = {
            {1.0, 2.0, 3.0},
            {2.0, 5.0, 6.0},
            {3.0, 6.0, 9.0}
        };
        
        /* write */ RealMatrix matrix = MatrixUtils.createSymmetricMatrix(data);

        // Create a vector and perform some operations
        double[] vectorData = {1.0, 2.0, 3.0};
        RealVector vector = new ArrayRealVector(vectorData);
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);

        // Perform matrix-vector multiplication
        RealVector resultVector = matrix.operate(vector);
        System.out.println("Matrix-Vector Multiplication Result: " + resultVector);

        // Perform matrix addition with another matrix
        double[][] otherData = {
            {0.0, 1.0, 0.0},
            {1.0, 0.0, 1.0},
            {0.0, 1.0, 0.0}
        };
        RealMatrix otherMatrix = MatrixUtils.createSymmetricMatrix(otherData);
        RealMatrix addedMatrix = matrix.add(otherMatrix);
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Retrieve the symmetric matrix using MatrixUtils
        /* read */ RealMatrix symmetricMatrix = MatrixUtils.getSymmetricMatrix(matrix);
        
        // Print the symmetric matrix
        System.out.println("Symmetric Matrix:");
        for (int i = 0; i < symmetricMatrix.getRowDimension(); i++) {
            for (int j = 0; j < symmetricMatrix.getColumnDimension(); j++) {
                System.out.print(symmetricMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform matrix subtraction with another matrix
        RealMatrix subtractedMatrix = matrix.subtract(otherMatrix);
        System.out.println("Subtracted Matrix:");
        for (int i = 0; i < subtractedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < subtractedMatrix.getColumnDimension(); j++) {
                System.out.print(subtractedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}