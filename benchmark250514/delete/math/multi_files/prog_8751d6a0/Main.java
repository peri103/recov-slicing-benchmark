import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0};
        double[] additionalData = {4.0, 5.0, 6.0};

        // Initialize vector operations
        VectorOperations vectorOps = new VectorOperations();
        vectorOps.initializeVector(data);

        // Perform operations with another vector
        RealVector additionalVector = MatrixUtils.createArrayRealVector(additionalData);
        RealVector scaledVector = additionalVector.mapMultiply(2.0);

        System.out.println("Scaled Vector:");
        for (double value : scaledVector.toArray()) {
            System.out.println(value);
        }

        // Initialize matrix operations
        MatrixOperations matrixOps = new MatrixOperations();
        matrixOps.createMatrix(new double[][]{data, additionalData});
        matrixOps.printMatrix();

        // Manipulate the vector before reading
        RealVector addedVector = vectorOps.getVector().add(additionalVector);
        System.out.println("Added Vector:");
        for (double value : addedVector.toArray()) {
            System.out.println(value);
        }

        // Read the original data
        /* read */ double[] readData = vectorOps.getVector().toArray();

        System.out.println("Original Vector:");
        for (double value : readData) {
            System.out.println(value);
        }

        // Perform some more operations on the read data
        double sum = 0;
        for (double value : readData) {
            sum += value;
        }
        System.out.println("Sum of original vector: " + sum);
    }
}