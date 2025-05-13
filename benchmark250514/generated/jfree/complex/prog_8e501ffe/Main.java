import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // Initialize PiePlot object
        PiePlot piePlot = new PiePlot();
        
        // Create a label generator
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        
        // Set the label generator using the write method
        /* write */ piePlot.setLabelGenerator(labelGenerator);
        
        // Create a pie dataset
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category A", 50);
        dataset.setValue("Category B", 30);
        dataset.setValue("Category C", 20);
        
        // Create a JFreeChart object using the dataset and the piePlot
        JFreeChart chart = ChartFactory.createPieChart("Sample Pie Chart", dataset, true, true, false);
        chart.getPlot().setBackgroundPaint(java.awt.Color.white);
        
        // Create a JFrame to display the chart
        JFrame frame = new JFrame("Chart Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(chart));
        frame.pack();
        frame.setVisible(true);
        
        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Unrelated operation " + i);
        }
        
        // Retrieve the label generator using the read method
        /* read */ PieSectionLabelGenerator retrievedLabelGenerator = piePlot.getLabelGenerator();
        
        // Print the result to verify the read method retrieved the correct value
        System.out.println(retrievedLabelGenerator.equals(labelGenerator));
    }
}