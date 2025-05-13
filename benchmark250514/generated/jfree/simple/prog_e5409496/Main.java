import org.jfree.chart.LegendItem;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Example Legend");
        /* write */ legendItem.setLineVisible(true);
        /* read */ boolean isVisible = legendItem.isLineVisible();
        System.out.println(isVisible);
    }
}