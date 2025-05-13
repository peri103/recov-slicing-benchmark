import org.apache.commons.math3.linear.SymmetricMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix of size 3x3
        SymmetricMatrix matrix = new SymmetricMatrix(3);

        // Write a value to the matrix
        /* write */ matrix.setEntry(1, 2, 5.0);

        // Read the value back from the matrix
        /* read */ double value = matrix.getEntry(1, 2);

        // Print the value to verify that the read value is the same as the written value
        System.out.println(value);
    }
}