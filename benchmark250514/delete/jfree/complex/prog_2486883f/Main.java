import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.needle.MeterNeedle;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class Main {
    public static void main(String[] args) {
        // Initialize CompassPlot and MeterNeedle
        CompassPlot compassPlot = new CompassPlot();
        MeterNeedle needle = new MeterNeedle();

        // Initialize PiePlot with a dataset
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category A", 43.2);
        dataset.setValue("Category B", 27.9);
        dataset.setValue("Category C", 79.5);
        PiePlot piePlot = new PiePlot(dataset);

        // Set needle in CompassPlot
        /* write */ compassPlot.setSeriesNeedle(0, needle);

        // Perform operations on piePlot
        piePlot.setSectionPaint("Category A", java.awt.Color.RED);
        piePlot.setSectionPaint("Category B", java.awt.Color.GREEN);
        piePlot.setSectionPaint("Category C", java.awt.Color.BLUE);

        // Calculate sum of values in dataset
        double totalValue = 0;
        for (Comparable key : dataset.getKeys()) {
            totalValue += dataset.getValue(key).doubleValue();
        }

        // Read needle from CompassPlot
        /* read */ MeterNeedle readNeedle = compassPlot.getSeriesNeedle(0);

        // Output results
        System.out.println("Total value in pie dataset: " + totalValue);
        System.out.println("Needle equals original: " + readNeedle.equals(needle));
    }
}