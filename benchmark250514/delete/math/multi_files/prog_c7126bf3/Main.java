import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0, 3.0}};
        MatrixOperations matrixOps = new MatrixOperations(data);

        // Set a new row vector
        matrixOps.setRowVector(0, new double[]{4.0, 5.0, 6.0});

        // Get the matrix and pass it to the reader
        RealMatrix matrix = matrixOps.getMatrix();
        MatrixReader reader = new MatrixReader(matrix);

        // Read the vector back
        RealVector readVector = reader.getRowVector(0);

        // Perform operations on the read vector
        System.out.println("Read vector: " + readVector);
        double norm = readVector.getNorm();
        System.out.println("Norm of the read vector: " + norm);
    }
}