public class Main {
    public static void main(String[] args) {
        ChartPlotter plotter = new ChartPlotter();
        plotter.configurePlot();

        ChartDisplay display = new ChartDisplay(plotter);
        display.displayChart();

        // Extra operations
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Retrieve the axis after the chart is displayed
        /* read */ ValueAxis retrievedAxis = plotter.getPlot().getRangeAxis();
        System.out.println("Axis Label: " + retrievedAxis.getLabel());

        double average = sum / 10;
        System.out.println("Average: " + average);
    }
}