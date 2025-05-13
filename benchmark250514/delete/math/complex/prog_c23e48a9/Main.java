import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        RealMatrix matrix = MatrixUtils.createRealMatrix(3, 1);
        
        /* write */ RealVector columnVector = MatrixUtils.createColumnRealVector(data);
        matrix.setColumnVector(0, columnVector);

        // Additional complex operations
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        RealMatrix complexMatrix = new Array2DRowRealMatrix(matrixData);
        
        // Perform matrix multiplication
        RealMatrix resultMatrix = complexMatrix.multiply(matrix);

        // Calculate the norm of the result vector
        double norm = resultMatrix.getColumnVector(0).getNorm();
        System.out.println("Norm of the result vector: " + norm);

        // Create another vector and perform addition
        RealVector anotherVector = MatrixUtils.createColumnRealVector(new double[]{10.0, 20.0, 30.0});
        RealVector sumVector = columnVector.add(anotherVector);
        System.out.println("Sum Vector: " + sumVector);

        // Extract the original column vector
        /* read */ RealVector readColumnVector = matrix.getColumnVector(0);
        
        System.out.println("Read Column Vector: " + readColumnVector);

        // More operations
        RealVector scaledVector = readColumnVector.mapMultiply(2.0);
        System.out.println("Scaled Vector: " + scaledVector);
    }
}