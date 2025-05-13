import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize data for the matrix
        double[] data = {1.0, 2.0, 3.0};
        
        // Create a vector using Apache Commons Math
        RealVector vector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        
        // Perform some operations on the vector
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector: ");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Create a matrix using Apache Commons Math
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(data);
        
        // Add the vector to the matrix
        RealMatrix augmentedMatrix = matrix.add(MatrixUtils.createRowRealMatrix(vector.toArray()));
        
        // Perform matrix operations
        RealMatrix transposedMatrix = augmentedMatrix.transpose();
        System.out.println("Transposed Matrix: ");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Extract a row from the matrix
        /* read */ RealMatrix readMatrix = matrix.getRowMatrix(0);
        
        // Print the values of the read matrix
        System.out.println("Read Matrix: ");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
        System.out.println();
        
        // Perform additional operations on the matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix resultMatrix = identityMatrix.multiply(transposedMatrix);
        System.out.println("Result Matrix after multiplication with identity matrix: ");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}