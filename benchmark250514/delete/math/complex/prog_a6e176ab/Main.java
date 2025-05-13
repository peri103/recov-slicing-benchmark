import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0, 3.0}};
        RealMatrix matrix = MatrixUtils.createRealMatrix(data);
        RealVector vector = MatrixUtils.createRowRealVector(data[0]);

        // Additional code to make the program more complex
        double[][] data2 = {{4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(data2);
        RealVector vector2 = matrix2.getRowVector(1);
        System.out.println("Vector from matrix2: " + vector2);

        // Operations on the second matrix
        matrix2.setColumnVector(0, vector);
        System.out.println("Updated matrix2:");
        for (int i = 0; i < matrix2.getRowDimension(); i++) {
            System.out.println(matrix2.getRowVector(i));
        }

        // Original write operation
        /* write */ matrix.setRowVector(0, vector);

        // More complex operations
        RealVector sumVector = vector.add(vector2);
        System.out.println("Sum of vectors: " + sumVector);

        RealMatrix matrix3 = matrix2.add(matrix);
        System.out.println("Sum of matrices:");
        for (int i = 0; i < matrix3.getRowDimension(); i++) {
            System.out.println(matrix3.getRowVector(i));
        }

        // Original read operation
        /* read */ RealVector readVector = matrix.getRowVector(0);
        System.out.println("Read vector from matrix: " + readVector);

        // Additional operations
        double norm = readVector.getNorm();
        System.out.println("Norm of read vector: " + norm);

        RealVector scaledVector = readVector.mapMultiply(2.0);
        System.out.println("Scaled read vector: " + scaledVector);
    }
}