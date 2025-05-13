import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        
        // Create a vector and perform operations on it
        double[] vectorData = {5.0, 6.0};
        RealVector vector = new ArrayRealVector(vectorData);
        vector.mapMultiplyToSelf(2.0);
        System.out.println("Vector after multiplication: " + vector);

        // Create another matrix and perform operations
        double[][] additionalData = {
            {5.0, 6.0},
            {7.0, 8.0}
        };
        BlockRealMatrix additionalMatrix = MatrixUtils.createBlockRealMatrix(additionalData);
        RealMatrix resultMatrix = additionalMatrix.add(MatrixUtils.createBlockRealMatrix(data));
        System.out.println("Resultant matrix after addition:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Use the original write method
        /* write */ BlockRealMatrix matrix = MatrixUtils.createBlockRealMatrix(data);

        // Perform some operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Use the original read method
        /* read */ BlockRealMatrix readMatrix = matrix.getSubMatrix(0, 1, 0, 1);

        System.out.println("Read sub-matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform some calculations using the read matrix
        RealMatrix multipliedMatrix = readMatrix.multiply(additionalMatrix);
        System.out.println("Multiplied matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}