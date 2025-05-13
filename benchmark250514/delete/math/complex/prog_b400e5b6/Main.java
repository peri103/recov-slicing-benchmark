import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        double[] additionalData = {4.0, 5.0, 6.0};
        
        /* write */ RealVector vector = MatrixUtils.createArrayRealVector(data);
        
        // Additional computations
        RealMatrix matrix1 = new Array2DRowRealMatrix(new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        RealMatrix matrix2 = new Array2DRowRealMatrix(new double[][]{{9, 8, 7}, {6, 5, 4}, {3, 2, 1}});
        
        RealMatrix resultMatrix = matrix1.multiply(matrix2);
        
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Perform some operations on additionalData
        RealVector additionalVector = MatrixUtils.createArrayRealVector(additionalData);
        RealVector sumVector = vector.add(additionalVector);
        
        // Print the sum vector
        System.out.println("Sum Vector:");
        for (int i = 0; i < sumVector.getDimension(); i++) {
            System.out.println(sumVector.getEntry(i));
        }
        
        /* read */ RealVector readVector = MatrixUtils.getArrayRealVector(vector.toArray());
        
        System.out.println("Read Vector:");
        for (int i = 0; i < readVector.getDimension(); i++) {
            System.out.println(readVector.getEntry(i));
        }
    }
}