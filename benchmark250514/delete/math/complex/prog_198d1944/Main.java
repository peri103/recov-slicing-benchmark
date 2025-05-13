import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize a matrix with one column
        double[][] data = { {1.0}, {2.0}, {3.0} };
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);

        // Create another matrix
        double[][] additionalData = { {7.0, 8.0}, {9.0, 10.0}, {11.0, 12.0} };
        RealMatrix additionalMatrix = MatrixUtils.createRealMatrix(additionalData);
        
        // Write: create a column real vector
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(new double[]{4.0, 5.0, 6.0});
        
        // Set this vector as the first column of the matrix
        matrix.setColumnVector(0, columnVector);
        
        // Perform some matrix operations
        RealMatrix multipliedMatrix = matrix.multiply(additionalMatrix);
        
        // Calculate the norm of the column vector
        double norm = columnVector.getNorm();
        System.out.println("Norm of the Column Vector: " + norm);
        
        // Create a row vector for additional operations
        RealVector rowVector = MatrixUtils.createRealVector(new double[]{13.0, 14.0, 15.0});
        
        // Add row vector to multiplied matrix's first row
        RealMatrix modifiedMatrix = multipliedMatrix.copy();
        modifiedMatrix.setRowVector(0, rowVector);
        
        // Print the modified matrix
        System.out.println("Modified Matrix:");
        for (int i = 0; i < modifiedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < modifiedMatrix.getColumnDimension(); j++) {
                System.out.print(modifiedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Read: get the column real vector
        /* read */ RealVector readVector = matrix.getColumnVector(0);
        
        // Output the read vector
        System.out.println("Read Vector: " + readVector);
        
        // Perform additional operations on the read vector
        RealVector scaledVector = readVector.mapMultiply(2.0);
        System.out.println("Scaled Read Vector: " + scaledVector);
    }
}