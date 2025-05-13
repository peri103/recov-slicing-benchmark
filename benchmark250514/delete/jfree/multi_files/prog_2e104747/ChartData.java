import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class ChartData {
    private XYSeries series;
    private XYSeriesCollection dataset;

    public ChartData(String seriesName) {
        this.series = new XYSeries(seriesName);
        this.dataset = new XYSeriesCollection(series);
    }

    public void addDataPoint(double x, double y) {
        series.add(x, y);
    }

    public XYSeriesCollection getDataset() {
        return dataset;
    }

    public XYSeries getSeries() {
        return series;
    }

    public void updateDataPoints(double increment) {
        for (int i = 0; i < series.getItemCount(); i++) {
            series.updateByIndex(i, series.getY(i).doubleValue() + increment);
        }
    }
}