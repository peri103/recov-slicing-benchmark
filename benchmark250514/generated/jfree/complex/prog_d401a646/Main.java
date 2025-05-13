import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import org.jfree.chart.plot.CategoryPlot;
import java.awt.BasicStroke;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        CategoryPlot categoryPlot = new CategoryPlot();

        // Set up the PiePlot with section paints
        /* write */ piePlot.setSectionPaint("Section1", Color.RED);
        piePlot.setSectionPaint("Section2", Color.BLUE);
        piePlot.setSectionPaint("Section3", Color.GREEN);

        // Configure the CategoryPlot with strokes
        categoryPlot.setRangeGridlineStroke(new BasicStroke(2.0f));
        categoryPlot.setDomainGridlineStroke(new BasicStroke(1.5f));

        // Perform some operations on the CategoryPlot
        BasicStroke stroke = (BasicStroke) categoryPlot.getRangeGridlineStroke();
        System.out.println("Range Gridline Stroke: " + stroke);

        // Further operations
        for (int i = 0; i < 3; i++) {
            Color color = (Color) piePlot.getSectionPaint("Section" + (i + 1));
            System.out.println("Section " + (i + 1) + " Paint: " + color);
        }

        // Retrieve and print the paint for Section1
        /* read */ Color sectionPaint = (Color) piePlot.getSectionPaint("Section1");
        System.out.println("Retrieved Section1 Paint: " + sectionPaint);
    }
}