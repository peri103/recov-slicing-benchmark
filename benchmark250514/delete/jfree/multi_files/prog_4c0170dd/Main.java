import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.util.TableOrder;

public class Main {
    public static void main(String[] args) {
        DataPlotter plotter = new DataPlotter();
        plotter.configurePlot();

        MultiplePiePlot plot = plotter.getPlot();
        PlotAnalyzer analyzer = new PlotAnalyzer(plot);

        // Analyze and print the data extract order
        TableOrder order = analyzer.analyzeExtractOrder();
        System.out.println("Data Extract Order: " + order);

        // Additional unrelated code to make the program more complex
        double sum = 0.0;
        for (int row = 0; row < plot.getDataset().getRowCount(); row++) {
            for (int col = 0; col < plot.getDataset().getColumnCount(); col++) {
                sum += plot.getDataset().getValue(row, col).doubleValue();
            }
        }
        System.out.println("Sum of all values in the dataset: " + sum);

        double average = sum / (plot.getDataset().getRowCount() * plot.getDataset().getColumnCount());
        System.out.println("Average value in the dataset: " + average);
    }
}