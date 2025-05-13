import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.util.TableOrder;

public class Main {
    public static void main(String[] args) {
        MultiplePiePlot plot = new MultiplePiePlot();
        /* write */ plot.setDataExtractOrder(TableOrder.BY_COLUMN);
        /* read */ TableOrder order = plot.getDataExtractOrder();
        System.out.println(order);
    }
}