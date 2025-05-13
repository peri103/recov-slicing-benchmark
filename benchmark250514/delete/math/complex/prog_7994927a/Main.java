import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[] rowData = {1.0, 2.0, 3.0};
        double[] anotherRowData = {4.0, 5.0, 6.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(rowData);
        
        // Creating another matrix
        RealMatrix anotherMatrix = MatrixUtils.createRowRealMatrix(anotherRowData);
        
        // Performing some operations on the matrices
        RealMatrix sumMatrix = matrix.add(anotherMatrix);
        RealMatrix productMatrix = matrix.multiply(anotherMatrix.transpose());
        
        // Extracting a row as a vector
        RealVector rowVector = matrix.getRowVector(0);
        
        // Performing operations on the vector
        RealVector scaledVector = rowVector.mapMultiply(2.0);
        
        // Printing results of operations
        System.out.println("Sum Matrix:");
        System.out.println(sumMatrix);
        
        System.out.println("Product Matrix:");
        System.out.println(productMatrix);
        
        System.out.println("Scaled Vector:");
        System.out.println(scaledVector);
        
        // Introducing a delay in accessing the original matrix
        for (int i = 0; i < 1000000; i++) {
            double dummyOperation = Math.sin(i);
        }
        
        /* read */ RealMatrix retrievedMatrix = MatrixUtils.getRowRealMatrix(matrix, 0);
        
        System.out.println("Retrieved Matrix:");
        System.out.println(retrievedMatrix);
    }
}