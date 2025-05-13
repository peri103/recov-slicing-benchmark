import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        double[] additionalData = {4.0, 5.0, 6.0};

        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(data);

        // Create a new matrix using different data
        RealMatrix additionalMatrix = MatrixUtils.createRowRealMatrix(additionalData);
        
        // Perform some operations on the matrices
        RealMatrix summedMatrix = matrix.add(additionalMatrix);
        System.out.println("Summed Matrix:");
        for (int i = 0; i < summedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < summedMatrix.getColumnDimension(); j++) {
                System.out.print(summedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(data);
        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();

        // More operations on the original matrix
        RealMatrix transposedMatrix = matrix.transpose();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix, 0);

        System.out.println("Matrix row:");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
    }
}