import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);
        
        // Create a matrix and perform some operations
        double[][] matrixData = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        RealMatrix matrix = new BlockRealMatrix(matrixData);
        RealMatrix transposedMatrix = matrix.transpose();
        
        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform some vector operations
        ArrayRealVector newVector = new ArrayRealVector(new double[] {4.0, 5.0, 6.0});
        ArrayRealVector addedVector = vector.add(newVector);
        
        // Print the added vector
        System.out.println("Added Vector:");
        for (int i = 0; i < addedVector.getDimension(); i++) {
            System.out.print(addedVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Retrieve the original vector's data
        /* read */ double[] readData = vector.getDataRef();
        
        System.out.println("Original Vector Data:");
        for (double value : readData) {
            System.out.println(value);
        }
        
        // Perform more operations on the matrix
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);
        
        // Print the multiplied matrix
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}