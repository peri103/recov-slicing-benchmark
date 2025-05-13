import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        double[] additionalData = {4.0, 5.0, 6.0};

        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(data);

        RealVector vector = new ArrayRealVector(additionalData);
        RealMatrix matrix2 = MatrixUtils.createRowRealMatrix(vector.toArray());

        matrix = matrix.add(matrix2); // Combine matrices

        for (int i = 0; i < matrix.getRowDimension(); i++) {
            RealVector rowVector = matrix.getRowVector(i);
            System.out.println("Row " + i + ": " + rowVector);
        }

        // Perform some unrelated operations
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i] * additionalData[i];
        }
        System.out.println("Dot product of data arrays: " + sum);

        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix, 0);
        System.out.println("Read Matrix Row 0: " + readMatrix);
    }
}