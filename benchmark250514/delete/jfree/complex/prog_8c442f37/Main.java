import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.data.general.DefaultPieDataset;

public class Main {
    public static void main(String[] args) {
        // Create a PiePlot instance
        PiePlot plot = new PiePlot();

        // Create a label generator
        StandardPieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();

        // Write: Set the label generator for the plot
        /* write */ plot.setLabelGenerator(labelGenerator);

        // Create a dataset for the pie chart
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category A", 43.2);
        dataset.setValue("Category B", 27.9);
        dataset.setValue("Category C", 79.5);

        // Set the dataset for the plot
        plot.setDataset(dataset);

        // Perform some unrelated operations
        double totalValue = 0.0;
        for (Comparable key : dataset.getKeys()) {
            Number value = dataset.getValue(key);
            totalValue += value.doubleValue();
        }
        System.out.println("Total Value: " + totalValue);

        // Use another label generator for demonstration
        PieSectionLabelGenerator anotherGenerator = new StandardPieSectionLabelGenerator("{0}: {1} ({2})");
        plot.setLabelGenerator(anotherGenerator);

        // Perform more operations
        for (Comparable key : dataset.getKeys()) {
            System.out.println("Key: " + key + ", Value: " + dataset.getValue(key));
        }

        // Read: Get the label generator from the plot
        /* read */ StandardPieSectionLabelGenerator retrievedGenerator = (StandardPieSectionLabelGenerator) plot.getLabelGenerator();

        // Print out the retrieved generator to verify it matches what was set
        System.out.println("Retrieved Label Generator: " + retrievedGenerator);

        // Perform additional operations
        for (int i = 0; i < dataset.getItemCount(); i++) {
            Comparable key = dataset.getKey(i);
            Number value = dataset.getValue(i);
            System.out.println("Item " + i + ": " + key + " = " + value);
        }
    }
}