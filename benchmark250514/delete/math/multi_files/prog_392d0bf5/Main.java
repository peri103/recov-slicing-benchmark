import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Work with vectors
        VectorUtils vectorUtils = new VectorUtils(5);
        vectorUtils.setEntry(0, 1.0);

        // Work with matrices
        MatrixOperations matrixOps = new MatrixOperations(3, 3);
        matrixOps.setEntry(0, 0, 2.0);
        matrixOps.setEntry(1, 1, 4.0);
        matrixOps.setEntry(2, 2, 6.0);
        matrixOps.printMatrix();

        // Create another vector for operations
        OpenMapRealVector anotherVector = new OpenMapRealVector(5);
        anotherVector.setEntry(1, 3.5);

        // Perform vector addition
        OpenMapRealVector resultVector = vectorUtils.getVector().add(anotherVector);

        // Print the result of vector addition
        System.out.println("Result of vector addition:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();

        // Read the OpenMapRealVector using the MatrixUtils class
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vectorUtils.getVector());

        // Print the value to verify the read operation
        System.out.println("Read vector entry at index 0: " + readVector.getEntry(0));
    }
}