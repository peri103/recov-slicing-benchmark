public class SymmetricMatrix {
    private double[][] data;

    public SymmetricMatrix(int size) {
        data = new double[size][size];
    }

    public void setEntry(int row, int column, double value) {
        if (row >= 0 && column >= 0 && row < data.length && column < data.length) {
            /* write */ data[row][column] = value;
            data[column][row] = value; // Ensure symmetry
        }
    }

    public double getEntry(int row, int column) {
        if (row >= 0 && column >= 0 && row < data.length && column < data.length) {
            return data[row][column];
        }
        return Double.NaN; // Return NaN if indices are out of bounds
    }
}
