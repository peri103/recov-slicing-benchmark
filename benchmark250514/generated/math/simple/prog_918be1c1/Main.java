import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3);
        /* write */ matrix.setEntry(1, 1, 5.0);
        /* read */ double value = matrix.getEntry(1, 1);
        System.out.println(value);
    }
}