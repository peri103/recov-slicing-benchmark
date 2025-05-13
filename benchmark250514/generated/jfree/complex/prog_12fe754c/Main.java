import org.jfree.chart.plot.PiePlot;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Main {
    public static void main(String[] args) {
        // Create a dataset
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category 1", 43.2);
        dataset.setValue("Category 2", 27.9);
        dataset.setValue("Category 3", 79.5);

        // Create a chart
        JFreeChart chart = ChartFactory.createPieChart("Pie Chart Example", dataset, true, true, false);

        // Get the plot
        PiePlot plot = (PiePlot) chart.getPlot();

        // Set section outline stroke
        Stroke stroke1 = new BasicStroke(2.0f);
        Stroke stroke2 = new BasicStroke(3.0f);
        
        /* write */ plot.setSectionOutlineStroke("Section1", stroke1);

        // Additional complex logic
        plot.setSectionPaint("Category 1", new Color(255, 0, 0));
        plot.setSectionPaint("Category 2", new Color(0, 255, 0));
        plot.setSectionPaint("Category 3", new Color(0, 0, 255));
        
        plot.setSectionOutlineStroke("Section2", stroke2);
        plot.setSectionOutlineStroke("Section3", stroke1);

        Stroke retrievedStroke2 = plot.getSectionOutlineStroke("Section2");
        Stroke retrievedStroke3 = plot.getSectionOutlineStroke("Section3");
        
        System.out.println("Retrieved Stroke for Section2: " + retrievedStroke2);
        System.out.println("Retrieved Stroke for Section3: " + retrievedStroke3);

        // More complex operations
        plot.setExplodePercent("Category 1", 0.10);
        plot.setExplodePercent("Category 2", 0.20);

        double explodePercent1 = plot.getExplodePercent("Category 1");
        double explodePercent2 = plot.getExplodePercent("Category 2");

        System.out.println("Explode Percent for Category 1: " + explodePercent1);
        System.out.println("Explode Percent for Category 2: " + explodePercent2);

        /* read */ Stroke retrievedStroke1 = plot.getSectionOutlineStroke("Section1");
        System.out.println("Retrieved Stroke for Section1: " + retrievedStroke1);
    }
}