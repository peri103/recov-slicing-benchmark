import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0}, {2.0}, {3.0}};
        
        // Initialize another matrix and vector for more complexity
        RealMatrix matrixA = MatrixUtils.createRealMatrix(new double[][] {{4.0, 5.0}, {6.0, 7.0}});
        RealVector vectorB = new ArrayRealVector(new double[] {8.0, 9.0});
        
        /* write */ RealMatrix columnMatrix = MatrixUtils.createColumnRealMatrix(data);
        
        // Perform some operations with matrixA and vectorB
        RealMatrix resultMatrix = matrixA.scalarMultiply(2.0);
        RealVector resultVector = vectorB.mapMultiply(3.0);
        
        // Print the results of operations
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
        
        // Some unrelated calculations
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * 0.5;
        }
        System.out.println("Sum: " + sum);
        
        /* read */ RealMatrix retrievedMatrix = columnMatrix.getColumnMatrix(0);
        
        // Print the retrieved matrix
        for (int i = 0; i < retrievedMatrix.getRowDimension(); i++) {
            System.out.println(retrievedMatrix.getEntry(i, 0));
        }
    }
}