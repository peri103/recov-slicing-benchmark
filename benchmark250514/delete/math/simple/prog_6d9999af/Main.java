import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Initialize the OpenMapRealVector with some values
        OpenMapRealVector vector = MatrixUtils.createOpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        
        // The write operation is performed here
        /* write */ vector.setEntry(0, 10.0); // Modify the first entry to demonstrate the write operation
        
        // The read operation to retrieve the OpenMapRealVector
        /* read */ OpenMapRealVector readVector = MatrixUtils.getOpenMapRealVector(vector);
        
        // Output the value to verify the read operation
        System.out.println("First entry value: " + readVector.getEntry(0));
    }
}