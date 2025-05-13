import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = { { 1 }, { 2 }, { 3 } };
        
        // Create a row matrix
        RealMatrix rowMatrix = MatrixUtils.createRowRealMatrix(new double[] { 4, 5, 6 });
        
        // Perform some operations on the row matrix
        RealMatrix multipliedMatrix = rowMatrix.scalarMultiply(2);
        
        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[] { 7, 8, 9 });
        RealVector addedVector = vector.mapAdd(1.0);
        
        /* write */ RealMatrix matrix = MatrixUtils.createColumnRealMatrix(data);
        
        // Perform some operations on the vector
        RealVector subtractedVector = vector.mapSubtract(3.0);
        
        // Output the results of vector operations
        System.out.println("Added Vector:");
        for (int i = 0; i < addedVector.getDimension(); i++) {
            System.out.println(addedVector.getEntry(i));
        }
        
        System.out.println("Subtracted Vector:");
        for (int i = 0; i < subtractedVector.getDimension(); i++) {
            System.out.println(subtractedVector.getEntry(i));
        }
        
        // Perform operations on multiplied matrix
        RealMatrix transposedMatrix = multipliedMatrix.transpose();
        
        // Output the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* read */ RealMatrix columnMatrix = MatrixUtils.getColumnRealMatrix(matrix, 0);
        
        // Output the column matrix
        System.out.println("Column Matrix:");
        for (int i = 0; i < columnMatrix.getRowDimension(); i++) {
            System.out.println(columnMatrix.getEntry(i, 0));
        }
    }
}