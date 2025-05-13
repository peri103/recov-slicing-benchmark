import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a symmetric matrix using MatrixUtils
        double[][] data = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = symmetricMatrix.transpose();
        RealMatrix multipliedMatrix = symmetricMatrix.multiply(transposedMatrix);
        
        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[] {1, 2, 3});
        RealVector resultVector = multipliedMatrix.operate(vector);
        
        // Print the result vector
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Conduct more matrix operations
        RealMatrix addedMatrix = symmetricMatrix.add(transposedMatrix);
        RealMatrix scalarMultipliedMatrix = addedMatrix.scalarMultiply(2.0);
        
        // Print the scalar multiplied matrix
        System.out.println("Scalar Multiplied Matrix:");
        for (int i = 0; i < scalarMultipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scalarMultipliedMatrix.getColumnDimension(); j++) {
                System.out.print(scalarMultipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the symmetric matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);

        // Print the original symmetric matrix to verify
        System.out.println("Original Symmetric Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}