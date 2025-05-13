import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a row real matrix using MatrixUtils
        double[] rowData = {1.0, 2.0, 3.0};
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);

        // Perform operations on the matrix
        RealMatrix transposedMatrix = matrix.transpose();
        RealMatrix multipliedMatrix = matrix.multiply(transposedMatrix);

        // Create a new vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector resultVector = matrix.operate(vector);
        
        // Print the results of operations
        System.out.println("Transposed Matrix:");
        System.out.println(transposedMatrix);
        System.out.println("Multiplied Matrix:");
        System.out.println(multipliedMatrix);
        System.out.println("Result Vector:");
        System.out.println(resultVector);

        // Read the row real matrix using MatrixUtils
        /* read */ RealMatrix readMatrix = matrix.getRowMatrix(0);
        
        // Print the read matrix
        System.out.println("Read Matrix:");
        System.out.println(readMatrix);

        // Additional operations to increase complexity
        RealMatrix identityMatrix = MatrixUtils.createRealIdentityMatrix(3);
        RealMatrix addedMatrix = matrix.add(identityMatrix);
        RealVector subtractedVector = resultVector.subtract(vector);

        // Print additional results
        System.out.println("Identity Matrix:");
        System.out.println(identityMatrix);
        System.out.println("Added Matrix:");
        System.out.println(addedMatrix);
        System.out.println("Subtracted Vector:");
        System.out.println(subtractedVector);
    }
}