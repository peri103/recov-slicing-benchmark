import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        
        /* write */ RealMatrix matrix = MatrixUtils.createRowRealMatrix(data);

        // Additional complex operations
        RealVector vector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealMatrix matrix2 = MatrixUtils.createRowRealMatrix(new double[]{7.0, 8.0, 9.0});
        
        RealMatrix sumMatrix = matrix.add(matrix2);
        RealVector resultVector = sumMatrix.operate(vector);

        System.out.println("Resultant Vector:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // More operations with matrix and vector
        RealMatrix scalarMultipliedMatrix = matrix.scalarMultiply(2.0);
        RealVector scaledVector = vector.mapMultiply(0.5);

        System.out.println("Scaled Matrix:");
        for (int i = 0; i < scalarMultipliedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < scalarMultipliedMatrix.getColumnDimension(); j++) {
                System.out.print(scalarMultipliedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println("Scaled Vector:");
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.print(scaledVector.getEntry(i) + " ");
        }
        System.out.println();

        // Continue with original read operation
        /* read */ RealMatrix readMatrix = matrix.getRowMatrix(0);
        
        System.out.println("Read Matrix:");
        for (int i = 0; i < readMatrix.getColumnDimension(); i++) {
            System.out.print(readMatrix.getEntry(0, i) + " ");
        }
    }
}