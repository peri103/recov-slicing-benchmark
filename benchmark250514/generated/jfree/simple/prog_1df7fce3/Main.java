import org.jfree.chart.LegendItem;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Example");
        Comparable seriesKey = "Series1";
        /* write */ legendItem.setSeriesKey(seriesKey);
        /* read */ Comparable readSeriesKey = legendItem.getSeriesKey();
        System.out.println(readSeriesKey);
    }
}