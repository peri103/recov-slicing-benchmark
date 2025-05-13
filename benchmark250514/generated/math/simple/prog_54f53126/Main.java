import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.SparseRealMatrix;

public class Main {
    public static void main(String[] args) {
        SparseRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        /* write */ matrix.setEntry(1, 1, 5.0);
        /* read */ double value = matrix.getEntry(1, 1);
        System.out.println(value);
    }
}