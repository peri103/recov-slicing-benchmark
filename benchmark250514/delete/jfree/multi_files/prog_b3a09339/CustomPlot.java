import org.jfree.chart.plot.Plot;
import org.jfree.data.general.Dataset;

public class CustomPlot extends Plot {
    private Dataset dataset;

    @Override
    public String getPlotType() {
        return "Custom Plot";
    }

    @Override
    public void setDataset(Dataset dataset) {
        /* write */ this.dataset = dataset;
    }

    @Override
    public Dataset getDataset() {
        return this.dataset;
    }
}
