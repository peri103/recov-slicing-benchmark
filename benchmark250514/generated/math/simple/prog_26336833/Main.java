import org.apache.commons.math3.linear.SparseRealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;

public class Main {
    public static void main(String[] args) {
        SparseRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        /* write */ matrix.setEntry(1, 1, 5.5);
        /* read */ double value = matrix.getEntry(1, 1);
        System.out.println(value);
    }
}