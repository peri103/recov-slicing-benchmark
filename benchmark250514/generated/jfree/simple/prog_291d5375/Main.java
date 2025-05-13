import org.jfree.chart.LegendItem;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Example");
        /* write */ legendItem.setSeriesKey("SeriesKeyExample");
        /* read */ Object seriesKey = legendItem.getSeriesKey();
        System.out.println(seriesKey);
    }
}