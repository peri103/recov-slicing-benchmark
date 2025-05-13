import org.apache.commons.math3.linear.SymmetricMatrix;

public class Main {
    public static void main(String[] args) {
        // Assuming SymmetricMatrix is a class from the Apache Commons Math library
        // and it has a constructor that takes the size of the matrix.
        SymmetricMatrix matrix = new SymmetricMatrix(3);

        /* write */ matrix.setEntry(0, 1, 5.0);
        
        /* read */ double value = matrix.getEntry(0, 1);
        System.out.println(value);
    }
}