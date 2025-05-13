import org.jfree.chart.LegendItem;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Example");

        // Set the series key using the write method
        /* write */ legendItem.setSeriesKey("SeriesKey");

        // Read the series key using the read method
        /* read */ Object seriesKey = legendItem.getSeriesKey();

        // Print the series key to verify the operation
        System.out.println(seriesKey);
    }
}