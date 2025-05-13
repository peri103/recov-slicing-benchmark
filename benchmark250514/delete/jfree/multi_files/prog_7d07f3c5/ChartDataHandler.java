import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.util.SortOrder;

public class ChartDataHandler {
    private MultiplePiePlot plot;

    public ChartDataHandler() {
        plot = new MultiplePiePlot();
    }

    public void setDataExtractOrder(SortOrder order) {
        /* write */ plot.setDataExtractOrder(order);
    }

    public SortOrder getDataExtractOrder() {
        return plot.getDataExtractOrder();
    }
}
