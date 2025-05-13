import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        ArrayRealVector vector = new ArrayRealVector(1);
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3);
        
        /* write */ vector.setEntry(0, 3.14);
        
        matrix.setEntry(0, 0, 1.0);
        matrix.setEntry(0, 1, 2.0);
        matrix.setEntry(0, 2, 3.0);
        matrix.setEntry(1, 0, 4.0);
        matrix.setEntry(1, 1, 5.0);
        matrix.setEntry(1, 2, 6.0);
        matrix.setEntry(2, 0, 7.0);
        matrix.setEntry(2, 1, 8.0);
        matrix.setEntry(2, 2, 9.0);

        RealVector rowVector = matrix.getRowVector(1);
        double sum = 0.0;
        for (int i = 0; i < rowVector.getDimension(); i++) {
            sum += rowVector.getEntry(i);
        }
        System.out.println("Sum of row 1 in matrix: " + sum);

        RealVector scaledVector = vector.mapMultiply(2.0);
        System.out.println("Scaled vector entry: " + scaledVector.getEntry(0));

        double value = 0.0;
        for (int i = 0; i < vector.getDimension(); i++) {
            /* read */ value = vector.getEntry(i);
        }
        System.out.println("Value from vector: " + value);
    }
}