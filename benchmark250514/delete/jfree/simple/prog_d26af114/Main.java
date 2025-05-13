import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.chart.util.TableOrder;

public class Main {
    public static void main(String[] args) {
        MultiplePiePlot plot = new MultiplePiePlot(DatasetUtilities.createCategoryDataset("Category", "Value", new double[][]{{1.0}}));
        
        /* write */ plot.setDataExtractOrder(TableOrder.BY_ROW);
        
        /* read */ TableOrder order = plot.getDataExtractOrder();
        
        System.out.println(order);
    }
}