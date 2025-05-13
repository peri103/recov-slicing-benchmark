import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);
        
        // Create a RealMatrix and perform some operations
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        
        // Perform matrix multiplication
        RealMatrix matrix2 = matrix.multiply(matrix);
        System.out.println("Matrix multiplication result:");
        for (int row = 0; row < matrix2.getRowDimension(); row++) {
            for (int col = 0; col < matrix2.getColumnDimension(); col++) {
                System.out.print(matrix2.getEntry(row, col) + " ");
            }
            System.out.println();
        }
        
        // Perform vector operations
        RealVector unitVector = vector.mapDivide(vector.getNorm());
        System.out.println("Unit vector:");
        for (int i = 0; i < unitVector.getDimension(); i++) {
            System.out.print(unitVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Modify the vector and read the original vector
        vector.setEntry(0, 10.0);
        vector.setEntry(1, 20.0);
        
        /* read */ RealVector readVector = MatrixUtils.getSparseRealVector(vector.toArray());
        
        System.out.println("Read vector:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.print(readVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Perform additional operations on the read vector
        RealVector scaledVector = readVector.mapMultiply(2.0);
        System.out.println("Scaled vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}