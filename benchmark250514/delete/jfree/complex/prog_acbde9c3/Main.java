import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        NumberAxis domainAxis = new NumberAxis("Domain Axis");
        NumberAxis rangeAxis = new NumberAxis("Range Axis");
        XYItemRenderer renderer = new XYLineAndShapeRenderer();
        
        /* write */ plot.setDomainAxis(domainAxis);
        
        plot.setRangeAxis(rangeAxis);
        plot.setRenderer(renderer);

        // Perform some calculations
        double result = calculateSomething(5, 10);
        System.out.println("Calculation Result: " + result);

        // Manipulate the renderer
        renderer.setSeriesPaint(0, java.awt.Color.RED);
        renderer.setSeriesShapesVisible(0, true);

        // More setup
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinesVisible(true);

        // Retrieve the domain axis and print its label
        /* read */ ValueAxis readAxis = plot.getDomainAxis();
        System.out.println("Domain Axis Label: " + readAxis.getLabel());

        // Additional operations
        for (int i = 0; i < 3; i++) {
            renderer.setSeriesPaint(i, new java.awt.Color((i+1) * 50, 100, 150));
            System.out.println("Series " + i + " Paint Set.");
        }
    }

    private static double calculateSomething(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }
}