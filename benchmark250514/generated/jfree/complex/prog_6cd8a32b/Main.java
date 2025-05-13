import org.jfree.chart.LegendItem;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PiePlot;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem and set its shape visibility
        LegendItem legendItem = new LegendItem("Example");
        /* write */ legendItem.setShapeVisible(true);

        // Create a PiePlot and configure it
        PiePlot piePlot = new PiePlot();
        piePlot.setSectionOutlinesVisible(true);
        piePlot.setLabelGenerator(null);

        // Perform some operations with the PiePlot
        double angle = piePlot.getStartAngle();
        System.out.println("Initial start angle: " + angle);

        // Update the start angle
        piePlot.setStartAngle(90.0);
        angle = piePlot.getStartAngle();
        System.out.println("Updated start angle: " + angle);

        // Check if the section outlines are visible
        boolean outlinesVisible = piePlot.getSectionOutlinesVisible();
        System.out.println("Section outlines visible: " + outlinesVisible);

        // Perform operations with LegendItem
        String description = legendItem.getDescription();
        System.out.println("Legend description: " + description);

        // Read the shape visibility status
        /* read */ boolean isVisible = legendItem.isShapeVisible();
        System.out.println("Shape visible: " + isVisible);

        // Further operations with LegendItem
        legendItem.setShapeVisible(false);
        boolean isVisibleAfterChange = legendItem.isShapeVisible();
        System.out.println("Shape visible after change: " + isVisibleAfterChange);

        // Perform operations with Plot
        Plot plot = piePlot;
        plot.setBackgroundAlpha(0.5f);
        float alpha = plot.getBackgroundAlpha();
        System.out.println("Background alpha: " + alpha);
    }
}