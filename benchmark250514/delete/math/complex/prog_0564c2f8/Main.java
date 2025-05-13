import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a 2D array to create a symmetric matrix
        double[][] data = {
            {1.0, 2.0, 3.0},
            {2.0, 4.0, 5.0},
            {3.0, 5.0, 6.0}
        };

        // Create a symmetric matrix using the provided method
        /* write */ RealMatrix symmetricMatrix = MatrixUtils.createSymmetricMatrix(data);

        // Additional matrix operations to increase complexity
        double[][] additionalData = {
            {7.0, 8.0, 9.0},
            {8.0, 10.0, 11.0},
            {9.0, 11.0, 12.0}
        };
        RealMatrix additionalMatrix = MatrixUtils.createRealMatrix(additionalData);

        // Perform matrix addition
        RealMatrix sumMatrix = symmetricMatrix.add(additionalMatrix);

        // Initialize a vector for multiplication
        RealVector vector = new ArrayRealVector(new double[] {1.0, 2.0, 3.0});

        // Multiply matrix with vector
        RealVector resultVector = sumMatrix.operate(vector);

        // Print the result of the vector multiplication
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Read the symmetric matrix using the provided method
        /* read */ RealMatrix readMatrix = MatrixUtils.getSymmetricMatrix(symmetricMatrix);

        // Print the read matrix to verify
        System.out.println("Read symmetric matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Additional operations to further increase complexity
        RealMatrix transposedMatrix = readMatrix.transpose();

        // Print the transposed matrix
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}