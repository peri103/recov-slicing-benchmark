public class TriangularMatrix {
    private double[][] data;

    public TriangularMatrix(int size) {
        data = new double[size][size];
    }

    public void setEntry(int row, int column, double value) {
        if (row >= column) {
            /* write */ data[row][column] = value;
        }
    }

    public double getEntry(int row, int column) {
        if (row >= column) {
            return data[row][column];
        }
        return 0.0;
    }
}
