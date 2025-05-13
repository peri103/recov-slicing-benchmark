import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ChartRenderer chartRenderer = new ChartRenderer();
        ChartData chartData = new ChartData("Random Data");

        for (int i = 0; i < 10; i++) {
            chartData.addDataPoint(i, Math.random() * 100);
        }

        JFreeChart chart = ChartFactory.createXYLineChart(
                "XY Chart Example",
                "X-Axis",
                "Y-Axis",
                chartData.getDataset()
        );

        chart.getXYPlot().setRenderer(chartRenderer.getRenderer());

        JFrame frame = new JFrame("Chart Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(chart));
        frame.pack();
        frame.setVisible(true);

        chartRenderer.setShapesVisible(true);

        // Additional computations
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 99: " + sum);

        // Retrieve the shapes visibility status
        /* read */ boolean shapesVisible = chartRenderer.getShapesVisible();
        System.out.println("Shapes visible: " + shapesVisible);

        // More computations
        double average = sum / 100.0;
        System.out.println("Average: " + average);

        // Modify series data
        chartData.updateDataPoints(10);

        // Print updated data
        for (int i = 0; i < chartData.getSeries().getItemCount(); i++) {
            System.out.println("Data point " + i + ": " + chartData.getSeries().getY(i));
        }
    }
}