import org.jfree.chart.LegendItem;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        /* write */ legendItem.setLineVisible(true);
        /* read */ boolean isLineVisible = legendItem.isLineVisible();
        System.out.println(isLineVisible);
    }
}