import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.util.SortOrder;

public class Main {
    public static void main(String[] args) {
        Dataset dataset = new DefaultPieDataset();
        MultiplePiePlot plot = new MultiplePiePlot(dataset);
        
        /* write */ plot.setDataExtractOrder(SortOrder.ASCENDING);
        /* read */ SortOrder order = plot.getDataExtractOrder();
        
        System.out.println(order);
    }
}