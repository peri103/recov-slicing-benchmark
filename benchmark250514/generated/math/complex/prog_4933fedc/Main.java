import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        double[] additionalData = {4.0, 5.0, 6.0};
        
        /* write */ RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(data);
        
        // Create another matrix and perform some operations
        RealMatrix additionalMatrix = MatrixUtils.createColumnRealMatrix(additionalData);
        RealMatrix sumMatrix = columnMatrix.add(additionalMatrix);
        
        // Perform vector operations
        RealVector vector = new ArrayRealVector(data);
        RealVector scaledVector = vector.mapMultiply(2.0);
        
        // Print scaled vector
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.println(scaledVector.getEntry(i));
        }
        
        // More matrix operations
        RealMatrix transposedMatrix = sumMatrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        /* read */ RealMatrix retrievedMatrix = columnMatrix.getColumnMatrix(0);
        
        System.out.println("Column Matrix:");
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            System.out.println(retrievedMatrix.getEntry(i, 0));
        }
    }
}