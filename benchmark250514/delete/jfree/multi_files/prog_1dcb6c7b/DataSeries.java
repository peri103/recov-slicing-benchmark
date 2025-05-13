import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class DataSeries {
    private XYSeriesCollection dataset;
    
    public DataSeries() {
        dataset = new XYSeriesCollection();
    }
    
    public void addSeries(String name, double[] data) {
        XYSeries series = new XYSeries(name);
        for (int i = 0; i < data.length; i++) {
            series.add(i, data[i]);
        }
        dataset.addSeries(series);
    }
    
    public XYSeriesCollection getDataset() {
        return dataset;
    }
}
