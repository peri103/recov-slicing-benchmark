public class DataModel {
    private double[] data;
    private CustomNumberAxis customNumberAxis;

    public DataModel(CustomNumberAxis customNumberAxis, int size) {
        this.customNumberAxis = customNumberAxis;
        data = new double[size];
        initializeData();
    }

    private void initializeData() {
        double lowerBound = customNumberAxis.getNumberAxis().getLowerBound();
        double tickSize = customNumberAxis.getNumberAxis().getTickUnit().getSize();
        for (int i = 0; i < data.length; i++) {
            data[i] = lowerBound + i * tickSize;
        }
    }

    public double[] getData() {
        return data;
    }
}
