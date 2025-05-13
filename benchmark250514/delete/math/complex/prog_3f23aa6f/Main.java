import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        double[] data2 = {4.0, 5.0, 6.0};
        
        /* write */ RealVector vector = MatrixUtils.createSparseRealVector(data);

        // Additional unrelated operations
        RealMatrix matrix = new Array2DRowRealMatrix(new double[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        
        RealVector vector2 = MatrixUtils.createSparseRealVector(data2);
        RealVector sumVector = vector.add(vector2);
        System.out.println("Sum of vectors: " + sumVector);

        // More complex operations
        RealMatrix multipliedMatrix = matrix.scalarMultiply(2);
        System.out.println("Multiplied matrix:");
        for (int i = 0; i < multipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < multipliedMatrix.getColumnDimension(); j++) {
                System.out.print(multipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        // Further operations
        RealVector vector3 = matrix.operate(vector);
        System.out.println("Matrix operated on vector: " + vector3);

        /* read */ RealVector readVector = MatrixUtils.getSparseRealVector(vector);
        
        System.out.println("Read vector: " + readVector);

        // Additional computations
        RealVector diffVector = vector.subtract(vector2);
        System.out.println("Difference of vectors: " + diffVector);
    }
}