import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        double[] vectorData = {5.0, 6.0};
        RealVector vector = new ArrayRealVector(vectorData);

        /* write */ RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        double[] vectorProduct = matrix.operate(vector).toArray();
        System.out.println("Vector Product:");
        for (double value : vectorProduct) {
            System.out.print(value + " ");
        }
        System.out.println();

        double[][] additionalData = {
            {7.0, 8.0},
            {9.0, 10.0}
        };
        RealMatrix additionalMatrix = MatrixUtils.createRealMatrix(additionalData);
        RealMatrix sumMatrix = matrix.add(additionalMatrix);

        System.out.println("Sum Matrix:");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            for (int j = 0; j < sumMatrix.getColumnDimension(); j++) {
                System.out.print(sumMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ RealMatrix readMatrix = MatrixUtils.getRealMatrix(matrix.getData());

        System.out.println("Original Matrix:");
        for (int i = 0; i < readMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readMatrix.getColumnDimension(); j++) {
                System.out.print(readMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}