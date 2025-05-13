import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one row for simplicity
        double[][] data = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Use the write method to create a row vector
        RealVector rowVector = MatrixUtils.createRowRealVector(new double[]{4.0, 5.0, 6.0});
        /* write */ matrix.setRowVector(0, rowVector);

        // Perform additional operations on the matrix
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix multipliedMatrix = matrix.multiply(identityMatrix);
        System.out.println("Multiplied Matrix: " + multipliedMatrix);

        // Create another matrix and perform operations
        double[][] anotherData = {{7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}};
        RealMatrix anotherMatrix = new Array2DRowRealMatrix(anotherData);
        RealMatrix addedMatrix = matrix.add(anotherMatrix);
        System.out.println("Added Matrix: " + addedMatrix);

        // Use the read method to get the row vector
        /* read */ RealVector readVector = matrix.getRowVector(0);
        System.out.println("Read Vector: " + readVector);

        // Further operations on the vector
        double norm = readVector.getNorm();
        System.out.println("Norm of the read vector: " + norm);

        RealVector scaledVector = readVector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);
    }
}