import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        double[] moreData = {4.0, 5.0, 6.0};

        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(data);

        // Create another matrix for additional operations
        RealMatrix anotherMatrix = MatrixUtils.createRowRealMatrix(moreData);

        // Perform some matrix addition
        RealMatrix sumMatrix = matrix.add(anotherMatrix);

        // Create a vector for multiplication
        RealVector vector = new ArrayRealVector(new double[]{1.0, 1.0, 1.0});

        // Multiply the sumMatrix by the vector
        RealVector resultVector = sumMatrix.operate(vector);

        // Print the result of the vector operation
        System.out.println("Result of vector operation:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Perform some matrix scaling
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);

        // Print the scaled matrix
        System.out.println("Scaled matrix:");
        for (int i = 0; i < scaledMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scaledMatrix.getColumnDimension(); j++) {
                System.out.print(scaledMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // More operations to make code complex
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);

        // Printing the multiplied matrix
        System.out.println("Multiplied matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Retrieve the original row matrix
        /* read */ RealMatrix retrievedMatrix = matrix.getRowMatrix(0);
        
        // Print the retrieved matrix
        System.out.println("Retrieved matrix:");
        for (int i = 0; i < retrievedMatrix.getColumnDimension(); i++) {
            System.out.print(retrievedMatrix.getEntry(0, i) + " ");
        }
        System.out.println();
    }
}