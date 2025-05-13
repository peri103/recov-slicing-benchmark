import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        // Create an OpenMapRealVector using the MatrixUtils class
        /* write */ OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(5);
        
        // Set a value in the vector to ensure there is something to read
        vector.setEntry(0, 1.0);
        
        // Create a 2D matrix for additional complexity
        RealMatrix matrix = new Array2DRowRealMatrix(3, 3);
        matrix.setEntry(0, 0, 2.0);
        matrix.setEntry(1, 1, 4.0);
        matrix.setEntry(2, 2, 6.0);
        
        // Perform matrix operations
        RealMatrix transposedMatrix = matrix.transpose();
        double[][] data = transposedMatrix.getData();
        
        // Print matrix values
        System.out.println("Matrix values:");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        
        // Create another OpenMapRealVector for complexity
        OpenMapRealVector anotherVector = new OpenMapRealVector(5);
        anotherVector.setEntry(1, 3.5);
        
        // Perform vector operations
        OpenMapRealVector resultVector = vector.add(anotherVector);
        
        // Print the result of vector addition
        System.out.println("Result of vector addition:");
        for (int i = 0; i < resultVector.getDimension(); i++) {
            System.out.print(resultVector.getEntry(i) + " ");
        }
        System.out.println();
        
        // Read the OpenMapRealVector using the MatrixUtils class
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);
        
        // Print the value to verify the read operation
        System.out.println("Read vector entry at index 0: " + readVector.getEntry(0));
    }
}