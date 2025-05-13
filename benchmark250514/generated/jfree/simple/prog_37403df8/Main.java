import org.jfree.chart.LegendItem;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        Comparable seriesKey = "SeriesKey1";
        
        /* write */ legendItem.setSeriesKey(seriesKey);
        /* read */ Comparable retrievedKey = legendItem.getSeriesKey();
        
        System.out.println(retrievedKey);
    }
}