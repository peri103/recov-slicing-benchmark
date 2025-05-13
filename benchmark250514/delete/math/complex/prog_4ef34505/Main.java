import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.SparseRealVector;

public class Main {
    public static void main(String[] args) {
        ArrayRealVector vector = new ArrayRealVector(1);
        SparseRealVector sparseVector = new SparseRealVector();
        
        // Initialize sparse vector with some values
        sparseVector.setEntry(5, 100.0);
        sparseVector.setEntry(10, 200.0);

        // Perform some operations on sparseVector
        RealVector scaledSparseVector = sparseVector.mapMultiply(2.0);
        System.out.println("Scaled Sparse Vector Entry at 5: " + scaledSparseVector.getEntry(5));
        
        /* write */ vector.setEntry(0, 42.0);

        // Perform operations on the vector
        ArrayRealVector anotherVector = new ArrayRealVector(new double[] {1.0, 2.0, 3.0});
        RealVector addedVector = vector.add(anotherVector);
        
        // Print the result of addition
        System.out.println("Added Vector Entry at 0: " + addedVector.getEntry(0));
        System.out.println("Added Vector Entry at 1: " + addedVector.getEntry(1));
        
        // Perform operations on anotherVector
        RealVector subtractedVector = anotherVector.subtract(vector);
        System.out.println("Subtracted Vector Entry at 0: " + subtractedVector.getEntry(0));
        
        /* read */ double value = vector.getEntry(0);
        System.out.println(value);
        
        // Further operations on sparseVector
        double dotProduct = sparseVector.dotProduct(scaledSparseVector);
        System.out.println("Dot Product of Sparse Vectors: " + dotProduct);
        
        // Creating a new vector and performing operations
        ArrayRealVector newVector = new ArrayRealVector(new double[] {4.0, 5.0, 6.0});
        RealVector multipliedVector = newVector.mapMultiply(3.0);
        System.out.println("Multiplied Vector Entry at 1: " + multipliedVector.getEntry(1));
    }
}