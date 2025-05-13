import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.util.SortOrder;

public class Main {
    public static void main(String[] args) {
        MultiplePiePlot plot = new MultiplePiePlot();
        /* write */ plot.setDataExtractOrder(SortOrder.ASCENDING);
        /* read */ SortOrder order = plot.getDataExtractOrder();
        System.out.println(order);
    }
}