import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1, 2}, {3, 4}};
        double[] vectorData = {5, 6};

        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);

        RealVector vector = new ArrayRealVector(vectorData);
        RealMatrix resultMatrix = matrix.scalarMultiply(2);
        RealVector resultVector = matrix.operate(vector);

        // Perform some matrix operations
        RealMatrix transposedMatrix = resultMatrix.transpose();
        RealMatrix multipliedMatrix = resultMatrix.multiply(transposedMatrix);

        // Print the result of matrix operations
        System.out.println("Result Matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Perform some vector operations
        RealVector addedVector = resultVector.add(vector);
        RealVector subtractedVector = resultVector.subtract(vector);

        // Print the result of vector operations
        System.out.println("Added Vector:");
        for (int i = 0; i < addedVector.getDimension(); i++) {
            System.out.print(addedVector.getEntry(i) + " ");
        }
        System.out.println();

        System.out.println("Subtracted Vector:");
        for (int i = 0; i < subtractedVector.getDimension(); i++) {
            System.out.print(subtractedVector.getEntry(i) + " ");
        }
        System.out.println();

        /* read */ double[][] readData = matrix.getData();

        System.out.println("Read Data Matrix:");
        for (double[] row : readData) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}