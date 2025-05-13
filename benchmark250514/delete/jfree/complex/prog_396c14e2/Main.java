import org.jfree.chart.plot.Plot;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Main {
    public static void main(String[] args) {
        // Create a custom plot
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return "Custom Plot Type";
            }
        };

        // Create a dataset
        Dataset dataset = new DefaultPieDataset();
        ((DefaultPieDataset) dataset).setValue("Category A", 45);
        ((DefaultPieDataset) dataset).setValue("Category B", 25);
        ((DefaultPieDataset) dataset).setValue("Category C", 30);

        // Set the dataset to the plot
        /* write */ plot.setDataset(dataset);

        // Create a chart using the dataset
        JFreeChart chart = ChartFactory.createPieChart(
            "Sample Pie Chart",
            (DefaultPieDataset) dataset,
            true,
            true,
            false
        );

        // Create a frame to display the chart
        JFrame frame = new JFrame("Chart Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(new ChartPanel(chart), BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            System.out.println("Adding: " + i + ", Current Sum: " + sum);
        }

        // Retrieve the dataset from the plot
        /* read */ Dataset retrievedDataset = plot.getDataset();

        // Verify the dataset retrieval
        System.out.println(retrievedDataset == dataset ? "Dataset set and retrieved successfully." : "Failed to retrieve dataset.");

        // More complex operations
        DefaultPieDataset newDataset = new DefaultPieDataset();
        newDataset.setValue("Category D", 50);
        newDataset.setValue("Category E", 50);
        
        plot.setDataset(newDataset);
        chart = ChartFactory.createPieChart(
            "Updated Pie Chart",
            newDataset,
            true,
            true,
            false
        );
        
        frame.add(new ChartPanel(chart), BorderLayout.SOUTH);
        frame.pack();
    }
}