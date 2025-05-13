import org.apache.commons.math3.linear.BlockRealMatrix;

public class Main {
    public static void main(String[] args) {
        BlockRealMatrix matrix = new BlockRealMatrix(3, 3);
        /* write */ matrix.setEntry(0, 0, 5.0);
        /* read */ double value = matrix.getEntry(0, 0);
        System.out.println(value);
    }
}