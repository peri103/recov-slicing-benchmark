import org.jfree.chart.title.TextTitle;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Create a TextTitle object
        TextTitle title = new TextTitle();
        
        // Create a dataset for a chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1, "Row1", "Column1");
        dataset.addValue(4, "Row1", "Column2");
        dataset.addValue(3, "Row2", "Column1");
        dataset.addValue(5, "Row2", "Column2");

        // Create a chart using the dataset
        JFreeChart chart = ChartFactory.createBarChart(
                "Sample Chart",
                "Category",
                "Value",
                dataset
        );

        // Set the title of the chart using the TextTitle object
        chart.setTitle(title);

        // Modify the title text
        /* write */ title.setText("Hello, World!");

        // Create a panel to display the chart
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 370));

        // Create a frame to hold the panel
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(chartPanel);
        frame.pack();
        frame.setVisible(true);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Read the title text
        /* read */ String text = title.getText();
        System.out.println("Chart Title: " + text);

        // Perform another unrelated operation
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}