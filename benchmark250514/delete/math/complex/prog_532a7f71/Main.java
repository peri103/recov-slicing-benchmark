import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create a RealMatrix with one column
        double[][] initialData = {{1.0}, {2.0}, {3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(initialData);

        // Create a RealVector using createColumnRealVector method
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});

        // Perform some unrelated operations
        double[][] additionalData = {{7.0, 8.0}, {9.0, 10.0}, {11.0, 12.0}};
        RealMatrix additionalMatrix = new Array2DRowRealMatrix(additionalData);
        RealVector additionalVector = additionalMatrix.getRowVector(1);
        System.out.println("Additional vector: " + additionalVector);

        // Set the column vector into the matrix
        matrix.setColumnVector(0, columnVector);

        // Perform more unrelated operations
        double[][] complexData = {{13.0, 14.0, 15.0}, {16.0, 17.0, 18.0}, {19.0, 20.0, 21.0}};
        RealMatrix complexMatrix = new Array2DRowRealMatrix(complexData);
        RealVector complexVector = complexMatrix.getColumnVector(2);
        System.out.println("Complex vector: " + complexVector);

        // Read the column vector using getColumnRealVector method
        /* read */ RealVector readVector = matrix.getColumnVector(0);

        // Print the read vector
        System.out.println("Read vector: " + readVector);

        // Additional unrelated operations
        RealVector sumVector = columnVector.add(complexVector);
        System.out.println("Sum of vectors: " + sumVector);
    }
}