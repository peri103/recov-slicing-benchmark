import org.apache.commons.math3.linear.SparseRealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;

public class Main {
    public static void main(String[] args) {
        SparseRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        /* write */ matrix.setEntry(0, 0, 5.0);
        /* read */ double value = matrix.getEntry(0, 0);
        System.out.println(value);
    }
}