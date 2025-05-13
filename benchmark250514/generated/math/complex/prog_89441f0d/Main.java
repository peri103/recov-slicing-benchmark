import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize data for matrix creation
        double[][] data = {{1.0, 2.0, 3.0}};
        
        // Write: Create a row real matrix using the data
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(data[0]);
        
        // Create a vector for additional operations
        RealVector vector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        
        // Perform vector operations
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);
        
        // Create another matrix for operations
        RealMatrix anotherMatrix = MatrixUtils.createRowRealMatrix(new double[]{7.0, 8.0, 9.0});
        
        // Perform matrix addition
        RealMatrix addedMatrix = matrix.add(anotherMatrix);
        System.out.println("Added Matrix:");
        for (int i = 0; i < addedMatrix.getColumnDimension(); i++) {
            System.out.print(addedMatrix.getEntry(0, i) + " ");
        }
        System.out.println();
        
        // More complex operations
        RealMatrix multipliedMatrix = matrix.multiply(anotherMatrix.transpose());
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Read: Retrieve the row real matrix
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.createRowRealMatrix(matrix.getRow(0));
        
        // Print the retrieved matrix
        System.out.println("Retrieved Matrix:");
        for (int i = 0; i < retrievedMatrix.getColumnDimension(); i++) {
            System.out.print(retrievedMatrix.getEntry(0, i) + " ");
        }
    }
}