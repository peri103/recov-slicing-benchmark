import org.jfree.chart.LegendItem;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Item");
        /* write */ legendItem.setSeriesKey("Sample Key");
        /* read */ Object seriesKey = legendItem.getSeriesKey();
        System.out.println(seriesKey);
    }
}