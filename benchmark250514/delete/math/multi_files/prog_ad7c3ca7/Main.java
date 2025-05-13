import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        double[][] matrixData = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        VectorOperations vectorOps = new VectorOperations();
        vectorOps.createVector(data);

        MatrixOperations matrixOps = new MatrixOperations(matrixData);
        RealVector resultVector = matrixOps.operate(vectorOps.getVector());

        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.println("Result Vector Element " + i + ": " + resultVector.getEntry(i));
        }

        RealVector scaledVector = vectorOps.scaleVector(2.0);
        for (int i = 0; i < scaledVector.getDimension(); i++) {
            System.out.println("Scaled Vector Element " + i + ": " + scaledVector.getEntry(i));
        }

        /* read */ RealVector readVector = vectorOps.getVector();

        System.out.println("Read Vector: " + readVector);
    }
}