import org.jfree.chart.LegendItem;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Create a series key to write
        Comparable seriesKey = "Series 1";

        // Write the series key using setSeriesKey method
        /* write */ legendItem.setSeriesKey(seriesKey);

        // Read the series key using getSeriesKey method
        /* read */ Comparable retrievedSeriesKey = legendItem.getSeriesKey();

        // Output the retrieved series key to verify the read operation
        System.out.println(retrievedSeriesKey);
    }
}