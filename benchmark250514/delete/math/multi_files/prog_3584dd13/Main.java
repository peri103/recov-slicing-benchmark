import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        int size = 3;

        // Initialize MatrixOperations to create an identity matrix
        MatrixOperations matrixOps = new MatrixOperations(size);

        // Use ComplexOperations with the identity matrix
        ComplexOperations complexOps = new ComplexOperations(matrixOps.getIdentityMatrix());

        // Perform matrix-vector multiplication
        RealVector resultVector = complexOps.multiplyWithVector();
        System.out.println("Result of matrix-vector multiplication:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }

        // Create another matrix and perform addition
        RealMatrix anotherMatrix = MatrixUtils.createRealMatrix(new double[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });

        RealMatrix addedMatrix = complexOps.addMatrix(anotherMatrix);
        System.out.println("Matrix after addition:");
        for (int i = 0; i < addedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < addedMatrix.getColumnDimension(); j++) {
                System.out.print(addedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Read the identity matrix
        /* read */ RealMatrix readMatrix = matrixOps.getIdentityMatrix();

        // Display the read matrix
        System.out.println("Identity Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}