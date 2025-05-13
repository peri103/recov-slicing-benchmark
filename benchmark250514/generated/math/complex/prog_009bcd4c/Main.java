import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        RealVector vector = new ArrayRealVector(3);
        /* write */ vector.setEntry(0, 5.0);

        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 3);
        for (int i = 0; i < matrix.getRowDimension(); i++) {
            for (int j = 0; j < matrix.getColumnDimension(); j++) {
                matrix.setEntry(i, j, i + j);
            }
        }

        RealVector anotherVector = new ArrayRealVector(3);
        anotherVector.setEntry(1, 10.0);
        anotherVector.setEntry(2, 15.0);

        RealVector resultVector = vector.add(anotherVector);
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println("Result Vector Entry " + i + ": " + resultVector.getEntry(i));
        }

        /* read */ double value = vector.getEntry(0);
        System.out.println(value);

        double matrixValue = matrix.getEntry(2, 2);
        System.out.println("Matrix Entry (2,2): " + matrixValue);

        RealVector multipliedVector = matrix.operate(vector);
        for (int i = 0; i < multipliedVector.getDimension(); i++) {
            System.out.println("Multiplied Vector Entry " + i + ": " + multipliedVector.getEntry(i));
        }
    }
}