import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        // Create a matrix with some values
        RealMatrix matrix = new BlockRealMatrix(new double[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        
        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);
        
        /* write */ ArrayRealVector vector = MatrixUtils.createArrayRealVector(data);
        
        // Perform some operations on the vector
        RealVector scaledVector = vector.mapMultiply(2.0);
        RealVector addedVector = scaledVector.add(new ArrayRealVector(new double[] {1.0, 1.0, 1.0}));
        
        // Print the results of matrix operations
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        System.out.println("Multiplied Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* read */ ArrayRealVector readVector = MatrixUtils.getArrayRealVector(vector.toArray());
        
        // Perform operations on the read vector
        RealVector subtractedVector = readVector.subtract(new ArrayRealVector(new double[] {0.5, 0.5, 0.5}));
        
        // Print the results of vector operations
        System.out.println("Original Vector: " + vector);
        System.out.println("Scaled Vector: " + scaledVector);
        System.out.println("Added Vector: " + addedVector);
        System.out.println("Subtracted Vector: " + subtractedVector);
    }
}