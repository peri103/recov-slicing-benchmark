import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class Main {
    public static void main(String[] args) {
        // Create a dataset for pie chart
        PieDataset dataset = createDataset();
        
        // Create a 3D pie chart
        JFreeChart chart = ChartFactory.createPieChart3D(
                "Sample Pie Chart 3D",  // chart title
                dataset,               // dataset
                true,                  // include legend
                true,
                false);
        
        // Get the plot from the chart
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        
        // Set depth factor for the plot
        /* write */ plot.setDepthFactor(0.3);
        
        // Additional logic to manipulate the chart
        PiePlot simplePlot = (PiePlot) chart.getPlot();
        simplePlot.setSectionOutlinesVisible(false);
        simplePlot.setLabelGenerator(null);
        
        // Perform some unrelated operations
        double totalValue = 0;
        for (Comparable key : dataset.getKeys()) {
            Number value = dataset.getValue(key);
            totalValue += value.doubleValue();
        }
        System.out.println("Total value of the dataset: " + totalValue);
        
        // Read the depth factor
        /* read */ double depthFactor = plot.getDepthFactor();
        System.out.println("Depth Factor: " + depthFactor);
        
        // More unrelated operations
        for (Comparable key : dataset.getKeys()) {
            System.out.println("Key: " + key + ", Value: " + dataset.getValue(key));
        }
    }
    
    private static PieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category 1", 40);
        dataset.setValue("Category 2", 30);
        dataset.setValue("Category 3", 20);
        dataset.setValue("Category 4", 10);
        return dataset;
    }
}