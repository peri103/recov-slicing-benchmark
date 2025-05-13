import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        double[][] matrixData = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        /* write */ RealVector vector = MatrixUtils.createArrayRealVector(data);

        RealMatrix matrix = new Array2DRowRealMatrix(matrixData);
        RealVector resultVector = matrix.operate(vector);

        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println("Result Vector Element " + i + ": " + resultVector.getEntry(i));
        }

        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        System.out.println("Sum of original vector elements: " + sum);

        // Performing some additional operations on the original vector
        RealVector scaledVector = vector.mapMultiply(2.0);
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.println("Scaled Vector Element " + i + ": " + scaledVector.getEntry(i));
        }

        /* read */ RealVector readVector = MatrixUtils.getArrayRealVector(vector);

        System.out.println("Read Vector: " + readVector);
    }
}