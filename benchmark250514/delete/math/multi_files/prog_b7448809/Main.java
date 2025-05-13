import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize vector wrapper with data
        RealVectorWrapper vectorWrapper = new RealVectorWrapper(new double[]{1.0, 2.0, 3.0});

        // Perform matrix operations
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        MatrixOperations matrixOps = new MatrixOperations(matrixData);

        // Transpose and multiply matrix
        RealMatrix transposedMatrix = matrixOps.transpose();
        RealMatrix multipliedMatrix = matrixOps.multiply();

        // Print transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Print multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Add vectors
        RealVector vector2 = MatrixUtils.createRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector addedVectors = matrixOps.addVectors(vectorWrapper.getVector(), vector2);

        // Print added vectors
        System.out.println("Added Vectors:");
        for (int i = 0; i < addedVectors.getDimension(); i++) {
            System.out.print(addedVectors.getEntry(i) + " ");
        }
        System.out.println();

        // Retrieve and print the original vector
        /* read */ RealVector retrievedVector = vectorWrapper.getVector();
        System.out.println("Retrieved Vector:");
        for (int i = 0; i < retrievedVector.getDimension(); i++) {
            System.out.print(retrievedVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}