import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import java.awt.Color;
import java.awt.Paint;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
        // Create a PiePlot and configure it
        PiePlot piePlot = new PiePlot();
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category A", 40);
        dataset.setValue("Category B", 30);
        dataset.setValue("Category C", 30);
        
        piePlot.setDataset(dataset);
        
        // Set the label outline paint to a specific color
        /* write */ piePlot.setLabelOutlinePaint(Color.RED);
        
        // Configure other properties of the PiePlot
        piePlot.setSectionOutlinesVisible(true);
        piePlot.setSectionOutlineStroke(new BasicStroke(2.0f));
        
        // Create a JFreeChart with the PiePlot
        JFreeChart chart = new JFreeChart("Pie Chart Example", JFreeChart.DEFAULT_TITLE_FONT, piePlot, true);
        
        // Perform some unrelated operations
        Plot plot = chart.getPlot();
        plot.setBackgroundPaint(Color.LIGHT_GRAY);
        plot.setOutlineStroke(new BasicStroke(1.5f));
        
        // Retrieve and print the label outline paint
        /* read */ Paint labelOutlinePaint = piePlot.getLabelOutlinePaint();
        System.out.println("Label Outline Paint: " + labelOutlinePaint);
        
        // Additional unrelated code
        Stroke outlineStroke = plot.getOutlineStroke();
        System.out.println("Outline Stroke: " + outlineStroke);
        
        PlotOrientation orientation = PlotOrientation.VERTICAL;
        System.out.println("Plot Orientation: " + orientation);
    }
}