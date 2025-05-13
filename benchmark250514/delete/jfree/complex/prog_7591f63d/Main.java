import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.needle.MeterNeedle;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class Main {
    public static void main(String[] args) {
        CompassPlot plot = new CompassPlot();
        MeterNeedle needle = new MeterNeedle();
        
        /* write */ plot.setSeriesNeedle(0, needle);
        
        // Adding complexity: Create a pie chart dataset and plot
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category 1", 45.0);
        dataset.setValue("Category 2", 30.0);
        dataset.setValue("Category 3", 25.0);

        PiePlot piePlot = new PiePlot(dataset);
        piePlot.setSectionPaint("Category 1", java.awt.Color.RED);
        piePlot.setSectionPaint("Category 2", java.awt.Color.BLUE);
        piePlot.setSectionPaint("Category 3", java.awt.Color.GREEN);

        // Perform some operations on the pie plot
        double totalValue = 0;
        for (Comparable key : (Iterable<Comparable>) dataset.getKeys()) {
            totalValue += dataset.getValue(key).doubleValue();
        }
        System.out.println("Total value of pie dataset: " + totalValue);

        // More operations
        int sections = dataset.getKeys().size();
        System.out.println("Number of sections in pie dataset: " + sections);

        // Return to the original CompassPlot read operation
        /* read */ MeterNeedle readNeedle = plot.getSeriesNeedle(0);
        
        System.out.println("Needles are equal: " + readNeedle.equals(needle));
    }
}