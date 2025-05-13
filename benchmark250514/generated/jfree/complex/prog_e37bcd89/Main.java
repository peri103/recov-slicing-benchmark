import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.data.general.DefaultPieDataset;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a PiePlot and set label shadow paint
        PiePlot piePlot = new PiePlot();
        Paint shadowPaint = new Color(100, 100, 100); // Gray color
        /* write */ piePlot.setLabelShadowPaint(shadowPaint);

        // Create a dataset for the pie chart
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category 1", 45.0);
        dataset.setValue("Category 2", 25.0);
        dataset.setValue("Category 3", 30.0);

        // Create a chart using the dataset
        JFreeChart chart = ChartFactory.createPieChart(
            "Sample Pie Chart",
            dataset,
            true,   // Include legend
            true,
            false
        );

        // Set the chart's background paint
        chart.setBackgroundPaint(new Color(255, 255, 255)); // White color

        // Create a list to store various colors
        List<Color> colorList = new ArrayList<>();
        colorList.add(new Color(255, 0, 0)); // Red
        colorList.add(new Color(0, 255, 0)); // Green
        colorList.add(new Color(0, 0, 255)); // Blue

        // Iterate over the color list and set section paint
        for (int i = 0; i < colorList.size(); i++) {
            piePlot.setSectionPaint(i, colorList.get(i));
        }

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Read the label shadow paint to verify
        /* read */ Paint readShadowPaint = piePlot.getLabelShadowPaint();
        System.out.println("Label Shadow Paint: " + readShadowPaint);

        // Print the section paints to verify
        for (int i = 0; i < colorList.size(); i++) {
            System.out.println("Section " + i + " Paint: " + piePlot.getSectionPaint(i));
        }
    }
}