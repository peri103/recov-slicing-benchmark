import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        VectorOperations vectorOps = new VectorOperations();
        vectorOps.setVectorEntry(0, 5.0);

        MatrixOperations matrixOps = new MatrixOperations();
        RealMatrix matrix = matrixOps.getMatrix();

        RealVector vector = vectorOps.getVector();
        RealVector multipliedVector = matrix.operate(vector);

        for (int i = 0; i < multipliedVector.getDimension(); i++) {
            System.out.println("Multiplied Vector Entry " + i + ": " + multipliedVector.getEntry(i));
        }

        /* read */ double value = vector.getEntry(0);
        System.out.println(value);

        double matrixValue = matrix.getEntry(2, 2);
        System.out.println("Matrix Entry (2,2): " + matrixValue);
    }
}