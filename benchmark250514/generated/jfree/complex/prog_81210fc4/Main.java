import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a PiePlot object with a dataset
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category A", 50);
        dataset.setValue("Category B", 30);
        dataset.setValue("Category C", 20);
        
        JFreeChart chart = ChartFactory.createPieChart("Sample Pie Chart", dataset, true, true, false);
        PiePlot piePlot = (PiePlot) chart.getPlot();

        // Set the outline paint to a specific color
        Paint outlinePaint = Color.RED;
        /* write */ piePlot.setOutlinePaint(outlinePaint);

        // Additional operations on the PiePlot object
        piePlot.setSectionPaint("Category A", Color.BLUE);
        piePlot.setSectionPaint("Category B", Color.GREEN);
        piePlot.setSectionPaint("Category C", Color.YELLOW);

        // Unrelated operations with ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");

        // Complex loop with conditionals
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                System.out.println("Even index: " + list.get(i));
            } else {
                System.out.println("Odd index: " + list.get(i));
            }
        }
        
        // Retrieve the outline paint to verify it was set correctly
        /* read */ Paint retrievedPaint = piePlot.getOutlinePaint();

        // Print the retrieved paint to confirm its value
        System.out.println("Retrieved Outline Paint: " + retrievedPaint);

        // Additional unrelated calculations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares from 1 to 5: " + sum);
    }
}