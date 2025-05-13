import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] rowData = {1.0, 2.0, 3.0};
        double[] additionalRowData = {4.0, 5.0, 6.0};

        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);

        // Create another matrix and perform some operations
        RealMatrix anotherMatrix = MatrixUtils.createRowRealMatrix(additionalRowData);
        RealMatrix combinedMatrix = matrix.add(anotherMatrix);

        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{7.0, 8.0, 9.0});
        RealVector resultVector = vector.mapAdd(10.0);

        // Print vector data
        System.out.println("Vector values after adding 10:");
        for (double value : resultVector.toArray()) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Perform some matrix operations
        RealMatrix scaledMatrix = combinedMatrix.scalarMultiply(2.0);
        System.out.println("Scaled matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (double value : scaledMatrix.getRow(i)) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix, 0);

        // Printing the read matrix row data
        System.out.println("Read matrix row data:");
        for (double value : readMatrix.getRow(0)) {
            System.out.print(value + " ");
        }
    }
}