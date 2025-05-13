import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.data.general.DatasetExtractOrder;

public class Main {
    public static void main(String[] args) {
        MultiplePiePlot plot = new MultiplePiePlot();
        
        /* write */ plot.setDataExtractOrder(DatasetExtractOrder.BY_ROW);
        
        /* read */ DatasetExtractOrder order = plot.getDataExtractOrder();
        
        System.out.println(order);
    }
}