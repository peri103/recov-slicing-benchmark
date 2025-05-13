import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.SymmetricMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a symmetric matrix with size 3x3
        SymmetricMatrix matrix = new SymmetricMatrix(3);
        
        // Initialize another matrix to perform some operations
        RealMatrix matrix2 = MatrixUtils.createRealMatrix(3, 3);
        matrix2.setEntry(0, 0, 2.0);
        matrix2.setEntry(1, 1, 3.0);
        matrix2.setEntry(2, 2, 4.0);
        
        // Perform some operations on matrix2
        RealMatrix resultMatrix = matrix2.scalarMultiply(1.5);
        System.out.println("Result Matrix:");
        for (int i = 0; i < resultMatrix.getRowDimension(); i++) {
            for (int j = 0; j < resultMatrix.getColumnDimension(); j++) {
                System.out.print(resultMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
        
        // Create an ArrayList to store some values
        ArrayList<Double> valuesList = new ArrayList<>();
        valuesList.add(10.0);
        valuesList.add(20.0);
        valuesList.add(30.0);

        // Write a value to the symmetric matrix at position (1, 2)
        /* write */ matrix.setEntry(1, 2, 5.0);
        
        // Perform more operations with the list
        double sum = 0;
        for (double value : valuesList) {
            sum += value;
        }
        System.out.println("Sum of values in list: " + sum);
        
        // Read the value from the symmetric matrix at position (1, 2)
        /* read */ double value = matrix.getEntry(1, 2);
        
        // Print the read value
        System.out.println("Read value from matrix: " + value);
        
        // Perform some operations using the read value
        double scaledValue = value * 2;
        System.out.println("Scaled read value: " + scaledValue);
    }
}