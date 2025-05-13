import org.jfree.chart.plot.Plot;
import org.jfree.data.general.Dataset;

public class CustomPlot extends Plot {
    private Dataset dataset;

    @Override
    public String getPlotType() {
        return "Custom Plot Type";
    }

    public void setCustomDataset(Dataset dataset) {
        /* write */ this.dataset = dataset;
    }

    public Dataset getCustomDataset() {
        return dataset;
    }
}