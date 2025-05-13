import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.data.general.DefaultPieDataset;
import java.awt.Color;
import java.awt.Paint;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a PiePlot and set its section outline paint
        PiePlot piePlot = new PiePlot();
        /* write */ piePlot.setSectionOutlinePaint("Section1", Color.RED);

        // Create a dataset for the pie chart
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Section1", 45);
        dataset.setValue("Section2", 30);
        dataset.setValue("Section3", 25);

        // Create a chart using the dataset
        JFreeChart chart = ChartFactory.createPieChart("Sample Pie Chart", dataset, true, true, false);

        // Create a HashMap to store section colors
        HashMap<String, Color> sectionColors = new HashMap<>();
        sectionColors.put("Section1", Color.RED);
        sectionColors.put("Section2", Color.BLUE);
        sectionColors.put("Section3", Color.GREEN);

        // Apply section colors to the pie plot
        for (String section : sectionColors.keySet()) {
            piePlot.setSectionPaint(section, sectionColors.get(section));
        }

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Retrieve the section outline paint
        /* read */ Paint paint = piePlot.getSectionOutlinePaint("Section1");
        System.out.println("Section1 Outline Paint: " + paint);

        // Additional unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        // Modify the dataset values
        dataset.setValue("Section1", 50);
        dataset.setValue("Section2", 25);
        dataset.setValue("Section3", 25);

        // Display the updated chart title
        chart.setTitle("Updated Sample Pie Chart");
        System.out.println("Chart title: " + chart.getTitle().getText());
    }
}