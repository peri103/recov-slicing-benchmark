import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.util.SortOrder;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class Main {
    public static void main(String[] args) {
        // Initialize a MultiplePiePlot and a PiePlot with datasets
        MultiplePiePlot plot = new MultiplePiePlot();
        PiePlot piePlot = new PiePlot(new DefaultPieDataset());

        // Configure the MultiplePiePlot
        plot.setLimit(0.5);
        plot.setAggregatedItemsKey("Others");

        // Configure the PiePlot
        piePlot.setSectionOutlinesVisible(true);
        piePlot.setLabelGenerator(null);

        // Set data extract order for MultiplePiePlot
        /* write */ plot.setDataExtractOrder(SortOrder.ASCENDING);

        // Perform some operations on PiePlot
        piePlot.setIgnoreZeroValues(true);
        piePlot.setSectionPaint("Category 1", java.awt.Color.RED);

        // Retrieve and print the data extract order from MultiplePiePlot
        /* read */ SortOrder order = plot.getDataExtractOrder();
        System.out.println("Data Extract Order: " + order);

        // Further operations to make the program complex
        double limit = plot.getLimit();
        System.out.println("Limit: " + limit);

        plot.setLimit(0.8);
        System.out.println("Updated Limit: " + plot.getLimit());

        // More operations on PiePlot
        piePlot.setSectionPaint("Category 2", java.awt.Color.BLUE);
        piePlot.setSectionPaint("Category 3", java.awt.Color.GREEN);

        // Print section paints
        System.out.println("Category 1 Paint: " + piePlot.getSectionPaint("Category 1"));
        System.out.println("Category 2 Paint: " + piePlot.getSectionPaint("Category 2"));
        System.out.println("Category 3 Paint: " + piePlot.getSectionPaint("Category 3"));
    }
}