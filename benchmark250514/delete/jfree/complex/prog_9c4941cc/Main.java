import org.jfree.chart.plot.ContourPlot;
import org.jfree.data.general.Dataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;

public class Main {
    public static void main(String[] args) {
        ContourPlot contourPlot = new ContourPlot();
        Dataset dataset = new XYSeriesCollection();
        
        // Adding data to the dataset
        XYSeries series = new XYSeries("Series1");
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);
        ((XYSeriesCollection) dataset).addSeries(series);
        
        // Create a chart using the dataset
        JFreeChart chart = ChartFactory.createXYLineChart(
            "Sample Chart", 
            "X-Axis", 
            "Y-Axis", 
            (XYSeriesCollection) dataset, 
            PlotOrientation.VERTICAL, 
            true, 
            true, 
            false
        );
        
        // Additional operations on the chart
        chart.setTitle("Updated Sample Chart");
        
        // More operations before using the write method
        int sum = 0;
        for (int i = 0; i < series.getItemCount(); i++) {
            sum += series.getY(i).intValue();
        }
        System.out.println("Sum of Y values: " + sum);
        
        /* write */ contourPlot.setDataset(dataset);

        // Perform some unrelated operations
        XYSeries series2 = new XYSeries("Series2");
        series2.add(3.0, 5.0);
        series2.add(4.0, 7.0);
        ((XYSeriesCollection) dataset).addSeries(series2);

        // Operations involving series2
        int maxY = Integer.MIN_VALUE;
        for (int i = 0; i < series2.getItemCount(); i++) {
            int yValue = series2.getY(i).intValue();
            if (yValue > maxY) {
                maxY = yValue;
            }
        }
        System.out.println("Max Y value in Series2: " + maxY);

        // Unrelated mathematical operation
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);

        /* read */ Dataset retrievedDataset = contourPlot.getDataset();
        
        System.out.println(retrievedDataset != null ? "Dataset set and retrieved successfully." : "Failed to set or retrieve dataset.");
    }
}