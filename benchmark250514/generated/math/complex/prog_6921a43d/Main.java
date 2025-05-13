import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        // Creating a RealMatrix for additional complexity
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);

        // Performing some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* write */ RealVector vector = MatrixUtils.createRealVector(data);
        
        // Additional operations on the vector
        double norm = vector.getNorm();
        System.out.println("Vector Norm: " + norm);

        double[] scaledData = vector.mapMultiply(2.0).toArray();
        System.out.println("Scaled Vector:");
        for (double val : scaledData) {
            System.out.print(val + " ");
        }
        System.out.println();

        /* read */ RealVector readVector = vector; // Since the method getRealVector is not directly available, we use the created vector directly
        
        System.out.println("Original Vector: " + readVector);
    }
}