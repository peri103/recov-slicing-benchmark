import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.needle.MeterNeedle;
import org.jfree.chart.needle.PointerNeedle;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class Main {
    public static void main(String[] args) {
        CompassPlot plot = new CompassPlot();
        MeterNeedle needle = new MeterNeedle();
        PointerNeedle pointerNeedle = new PointerNeedle();
        PiePlot piePlot = new PiePlot();
        DefaultPieDataset dataset = new DefaultPieDataset();
        
        /* write */ plot.setSeriesNeedle(0, needle);
        
        // Additional code using PiePlot
        dataset.setValue("Category 1", 45);
        dataset.setValue("Category 2", 25);
        dataset.setValue("Category 3", 30);
        piePlot.setDataset(dataset);
        piePlot.setSectionOutlinesVisible(false);
        
        // Using CompassPlot with another needle
        plot.setSeriesNeedle(1, pointerNeedle);
        
        // Manipulating dataset values
        dataset.setValue("Category 4", 55);
        dataset.remove("Category 2");
        
        // More complex operations
        double totalValue = 0.0;
        for (Comparable key : dataset.getKeys()) {
            Number value = dataset.getValue(key);
            totalValue += value.doubleValue();
        }
        
        System.out.println("Total value of dataset: " + totalValue);
        
        // Retrieve the original needle and print comparison
        /* read */ MeterNeedle retrievedNeedle = plot.getSeriesNeedle(0);
        
        System.out.println(retrievedNeedle.equals(needle));
        
        // Additional dataset manipulations
        dataset.setValue("Category 5", 20);
        dataset.setValue("Category 6", 10);
        
        for (Comparable key : dataset.getKeys()) {
            System.out.println("Key: " + key + ", Value: " + dataset.getValue(key));
        }
    }
}