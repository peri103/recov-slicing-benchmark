import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] row = {1.0, 2.0, 3.0};
        double[] anotherRow = {4.0, 5.0, 6.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(row);
        
        // Create another matrix using a different method
        RealMatrix anotherMatrix = MatrixUtils.createRowRealMatrix(anotherRow);
        
        // Perform some operations on the matrices
        RealMatrix sumMatrix = matrix.add(anotherMatrix);
        RealMatrix productMatrix = matrix.multiply(anotherMatrix.transpose());
        
        // Create a vector and perform operations
        RealVector vector = new ArrayRealVector(new double[]{1.0, 1.0, 1.0});
        RealVector transformedVector = matrix.operate(vector);
        
        // Print results of operations
        System.out.println("Sum matrix: " + sumMatrix);
        System.out.println("Product matrix: " + productMatrix);
        System.out.println("Transformed vector: " + transformedVector);
        
        /* read */ RealMatrix readMatrix = MatrixUtils.getRowRealMatrix(matrix, 0);
        System.out.println("Row matrix: " + readMatrix);
        
        // Further operations to increase complexity
        RealMatrix scaledMatrix = matrix.scalarMultiply(2.0);
        RealMatrix subMatrix = matrix.subtract(scaledMatrix);
        
        System.out.println("Scaled matrix: " + scaledMatrix);
        System.out.println("Subtracted matrix: " + subMatrix);
    }
}