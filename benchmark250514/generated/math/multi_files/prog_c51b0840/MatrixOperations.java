import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class MatrixOperations {
    public static void performVectorOperations(double[] rowData) {
        // Create a vector using ArrayRealVector
        RealVector vector = new ArrayRealVector(rowData);
        
        // Perform some operations on the vector
        RealVector scaledVector = vector.mapMultiply(2.0);
        RealVector addedVector = vector.add(scaledVector);

        // Print the scaled and added vectors
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println("\nAdded Vector:");
        for (int i = 0; i < addedVector.getDimension(); i++) {
            System.out.print(addedVector.getEntry(i) + " ");
        }
        System.out.println();
    }

    public static void performMatrixOperations(MatrixHandler handler) {
        // Retrieve the matrix
        RealMatrix matrix = handler.getMatrix();

        // Perform some unrelated operations
        RealMatrix multipliedMatrix = matrix.scalarMultiply(3.0);
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}
