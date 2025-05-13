import org.jfree.chart.LegendItem;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Example");
        /* write */ legendItem.setShapeVisible(true);
        /* read */ boolean isVisible = legendItem.isShapeVisible();
        System.out.println(isVisible);
    }
}