import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] initialData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        RealMatrix matrix = MatrixUtils.createRealMatrix(initialData);
        
        // Additional matrices and vectors
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(new double[][]{
            {10.0, 11.0, 12.0},
            {13.0, 14.0, 15.0},
            {16.0, 17.0, 18.0}
        });

        RealVector additionalVector = new ArrayRealVector(new double[]{19.0, 20.0, 21.0});
        
        // Perform operations on the additional matrix
        RealMatrix resultMatrix = matrix.add(additionalMatrix);
        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform operations on the additional vector
        RealVector resultVector = additionalVector.mapAdd(5.0);
        System.out.println("Result Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{10.0, 11.0, 12.0});
        matrix.setColumnVector(0, columnVector);

        // Perform some unrelated operations
        RealVector unrelatedVector = new ArrayRealVector(new double[]{22.0, 23.0, 24.0});
        RealVector scaledVector = unrelatedVector.mapMultiply(2.0);
        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();

        // Calculate the norm of an unrelated vector
        double norm = unrelatedVector.getNorm();
        System.out.println("Norm of Unrelated Vector: " + norm);

        /* read */ RealVector readColumnVector = matrix.getColumnVector(0);
        System.out.println("Read Column Vector:");
        for (int i = 0; i < readColumnVector.getDimension(); i++) {
            System.out.print(readColumnVector.getEntry(i) + " ");
        }
        System.out.println();
    }
}