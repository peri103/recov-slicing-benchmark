import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        /* write */ RealMatrix matrix = MatrixUtils.createArray2DRowRealMatrix(data);
        /* read */ double[][] retrievedData = matrix.getData();
        
        for (int i = 0; i < retrievedData.length; i++) {
            for (int j = 0; j < retrievedData[i].length; j++) {
                System.out.print(retrievedData[i][j] + " ");
            }
            System.out.println();
        }
    }
}