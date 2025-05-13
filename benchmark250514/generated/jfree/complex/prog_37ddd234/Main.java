import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.category.BarRenderer;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        CategoryPlot categoryPlot = new CategoryPlot();
        NumberAxis numberAxis = new NumberAxis();
        BarRenderer barRenderer = new BarRenderer();

        // Setting up the CategoryPlot with a NumberAxis and BarRenderer
        categoryPlot.setRangeAxis(numberAxis);
        categoryPlot.setRenderer(barRenderer);

        // Performing operations on the CategoryPlot
        numberAxis.setAutoRangeIncludesZero(false);
        barRenderer.setItemMargin(0.2);

        // Setting label gap on PiePlot
        /* write */ piePlot.setLabelGap(0.05);

        // Adding more complex operations
        double axisLowerBound = numberAxis.getLowerBound();
        double axisUpperBound = numberAxis.getUpperBound();
        System.out.println("Axis Lower Bound: " + axisLowerBound);
        System.out.println("Axis Upper Bound: " + axisUpperBound);

        // Modifying PiePlot further
        piePlot.setInteriorGap(0.1);
        piePlot.setCircular(true);

        // Reading label gap from PiePlot
        /* read */ double labelGap = piePlot.getLabelGap();
        System.out.println("Label Gap: " + labelGap);

        // Additional operations with CategoryPlot
        numberAxis.setAutoRange(true);
        barRenderer.setSeriesPaint(0, java.awt.Color.BLUE);

        // Final print statements for verification
        System.out.println("Interior Gap: " + piePlot.getInteriorGap());
        System.out.println("Is Circular: " + piePlot.isCircular());
    }
}