import org.jfree.chart.plot.Crosshair;
import org.jfree.chart.labels.CrosshairLabelGenerator;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class Main {
    public static void main(String[] args) {
        // Initialize Crosshair and LabelGenerator
        Crosshair crosshair = new Crosshair();
        CrosshairLabelGenerator labelGenerator = new CrosshairLabelGenerator() {
            @Override
            public String generateLabel(Crosshair crosshair) {
                return "Sample Label";
            }
        };
        
        // Initialize Plot and Renderer
        NumberAxis xAxis = new NumberAxis("X");
        NumberAxis yAxis = new NumberAxis("Y");
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        XYPlot plot = new XYPlot(null, xAxis, yAxis, renderer);

        // Set some properties of the plot
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinesVisible(true);
        
        // Set the label generator for the crosshair
        /* write */ crosshair.setLabelGenerator(labelGenerator);
        
        // Perform operations on the plot
        plot.setRenderer(renderer);
        plot.setDomainAxis(xAxis);
        plot.setRangeAxis(yAxis);

        // Retrieve and print label generator from crosshair
        /* read */ CrosshairLabelGenerator retrievedGenerator = crosshair.getLabelGenerator();
        System.out.println(retrievedGenerator.generateLabel(crosshair));

        // Additional operations to make the program more complex
        renderer.setSeriesPaint(0, java.awt.Color.RED);
        renderer.setSeriesShapesVisible(0, true);

        // Modify crosshair properties
        crosshair.setValue(10.0);
        crosshair.setVisible(true);

        // Print some properties
        System.out.println("Crosshair Value: " + crosshair.getValue());
        System.out.println("Crosshair Visibility: " + crosshair.isVisible());
    }
}