import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a 2D array to initialize the matrix
        double[][] data = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };

        // Create a RealMatrix from the data
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create a RealVector to be written to the matrix
        RealVector vector = MatrixUtils.createRowRealVector(new double[]{1, 2, 3});

        // Create another matrix for complex operations
        double[][] complexData = {
            {5, 6, 7},
            {8, 9, 10},
            {11, 12, 13}
        };
        RealMatrix complexMatrix = new Array2DRowRealMatrix(complexData);

        // Perform some operations on complexMatrix
        RealVector columnVector = complexMatrix.getColumnVector(0);
        System.out.println("Column vector from complexMatrix: " + columnVector);

        // Create a new vector for matrix addition
        RealVector additionVector = new ArrayRealVector(new double[]{2, 2, 2});
        RealVector resultVector = columnVector.add(additionVector);
        System.out.println("Result vector after addition: " + resultVector);

        /* write */
        matrix.setRowVector(1, vector);

        // More complex operations
        RealMatrix multipliedMatrix = complexMatrix.scalarMultiply(2);
        System.out.println("Multiplied matrix: ");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            System.out.println(multipliedMatrix.getRowVector(i));
        }

        /* read */
        RealVector readVector = matrix.getRowVector(1);

        System.out.println("Read vector: " + readVector);

        // Additional operations to make the program more complex
        RealMatrix sumMatrix = matrix.add(multipliedMatrix);
        System.out.println("Sum matrix: ");
        for (int i = 0; i < sumMatrix.getRowDimension(); i++) {
            System.out.println(sumMatrix.getRowVector(i));
        }
    }
}