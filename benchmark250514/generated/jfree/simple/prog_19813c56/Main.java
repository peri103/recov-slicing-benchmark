import org.jfree.chart.LegendItem;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        /* write */ legendItem.setSeriesKey("SeriesKey1");
        /* read */ Object seriesKey = legendItem.getSeriesKey();
        System.out.println(seriesKey);
    }
}