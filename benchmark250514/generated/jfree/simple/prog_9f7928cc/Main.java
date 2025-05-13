import org.jfree.chart.LegendItem;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        Comparable seriesKey = "Sample Series Key";
        
        /* write */ legendItem.setSeriesKey(seriesKey);
        /* read */ Comparable readSeriesKey = legendItem.getSeriesKey();
        
        System.out.println(readSeriesKey);
    }
}