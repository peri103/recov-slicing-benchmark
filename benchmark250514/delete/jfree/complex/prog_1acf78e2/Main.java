import org.jfree.chart.plot.Crosshair;
import org.jfree.chart.labels.CrosshairLabelGenerator;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        Crosshair crosshair = new Crosshair();
        CrosshairLabelGenerator labelGenerator = new CrosshairLabelGenerator() {
            @Override
            public String generateLabel(Crosshair crosshair) {
                return "Crosshair Label";
            }
        };
        
        /* write */ crosshair.setLabelGenerator(labelGenerator);
        
        // Create a simple XY dataset
        XYSeries series = new XYSeries("Random Data");
        for (int i = 0; i < 10; i++) {
            series.add(i, Math.random() * 100);
        }
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        
        // Create an XY plot using the dataset
        XYPlot xyPlot = new XYPlot();
        xyPlot.setDataset(dataset);
        
        // Add crosshair to the plot
        xyPlot.addDomainCrosshair(crosshair);
        
        // Perform some operations on the plot
        double rangeLowerBound = xyPlot.getRangeAxis().getLowerBound();
        double rangeUpperBound = xyPlot.getRangeAxis().getUpperBound();
        System.out.println("Range Axis Lower Bound: " + rangeLowerBound);
        System.out.println("Range Axis Upper Bound: " + rangeUpperBound);
        
        // Additional operations with the dataset
        for (int i = 0; i < series.getItemCount(); i++) {
            System.out.println("Data Point: " + series.getX(i) + ", " + series.getY(i));
        }
        
        // Retrieve the label generator from the crosshair
        /* read */ CrosshairLabelGenerator retrievedLabelGenerator = crosshair.getLabelGenerator();
        
        // Use the retrieved label generator
        System.out.println(retrievedLabelGenerator.generateLabel(crosshair));
    }
}