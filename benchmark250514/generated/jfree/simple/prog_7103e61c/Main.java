import org.jfree.chart.LegendItem;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample");
        /* write */ legendItem.setSeriesKey("Key1");
        /* read */ Object seriesKey = legendItem.getSeriesKey();
        System.out.println(seriesKey);
    }
}