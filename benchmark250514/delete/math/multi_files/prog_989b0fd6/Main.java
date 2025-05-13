import org.apache.commons.math3.linear.ArrayRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize vector data
        double[] vectorData = {1.0, 2.0, 3.0};

        // Use VectorUtils to create and manipulate vectors
        VectorUtils vectorUtils = new VectorUtils();
        vectorUtils.createVector(vectorData);

        // Perform operations on the vector
        ArrayRealVector vector = vectorUtils.getVector();
        vector.mapAddToSelf(2.0); // Add 2 to each element
        vector.mapMultiplyToSelf(0.5); // Multiply each element by 0.5

        // Initialize matrix data
        double[][] matrixData = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };

        // Use MatrixOperations to create and print matrices
        MatrixOperations matrixOps = new MatrixOperations();
        matrixOps.createMatrix(matrixData);
        matrixOps.printMatrix();

        // Access the original ArrayRealVector using the read method
        /* read */ ArrayRealVector readVector = vectorUtils.getVector();

        // Print the values to ensure the read method accessed the correct data
        System.out.println("Read Vector:");
        for (double v : readVector.toArray()) {
            System.out.println(v);
        }

        // Perform additional operations
        ArrayRealVector anotherVector = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        ArrayRealVector sumVector = readVector.add(anotherVector);

        System.out.println("Sum Vector:");
        for (double v : sumVector.toArray()) {
            System.out.println(v);
        }

        // Calculate the dot product of two vectors
        double dotProduct = readVector.dotProduct(anotherVector);
        System.out.println("Dot Product: " + dotProduct);
    }
}