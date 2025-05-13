import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.MatrixUtils;

public class Main {
    public static void main(String[] args) {
        double[] columnData = {1.0, 2.0, 3.0};
        VectorOperations vectorOps = new VectorOperations(columnData);

        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0},
            {5.0, 6.0}
        };
        ComplexMatrixOperations complexOps = new ComplexMatrixOperations(data);

        // Perform operations on the additional matrix
        RealMatrix transposedMatrix = complexOps.transposeMatrix();
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.getRowDimension(); i++) {
            for (int j = 0; j < transposedMatrix.getColumnDimension(); j++) {
                System.out.print(transposedMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        double rowSum = complexOps.sumFirstRow();
        System.out.println("Sum of the first row: " + rowSum);

        // Use the read method to get the column vector from the original matrix
        /* read */ RealVector columnVector = vectorOps.getColumnVector(0);

        // Print the column vector to verify the read operation
        System.out.println("Column Vector:");
        for (int i = 0; i < columnVector.getDimension(); i++) {
            System.out.println(columnVector.getEntry(i));
        }

        // Perform additional unrelated operations
        double[] newVectorData = {7.0, 8.0, 9.0};
        RealVector newVector = MatrixUtils.createRealVector(newVectorData);
        RealVector resultVector = columnVector.add(newVector);

        System.out.println("Resultant Vector after addition:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println(resultVector.getEntry(i));
        }
    }
}