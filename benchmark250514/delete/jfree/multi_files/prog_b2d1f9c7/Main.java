import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;

public class Main {
    public static void main(String[] args) {
        ChartComponents components = new ChartComponents();
        ChartData data = new ChartData();

        JFreeChart chart = ChartFactory.createBarChart(
            "Sample Chart",
            "Category",
            "Value",
            data.getDataset(),
            PlotOrientation.VERTICAL,
            true,
            true,
            false
        );

        System.out.println("Chart Title: " + chart.getTitle().getText());
        System.out.println("Dataset Row Count: " + data.getDataset().getRowCount());

        /* read */ CategoryAxis retrievedAxis = components.getPlot().getDomainAxis();
        System.out.println("Retrieved Axis Label: " + retrievedAxis.getLabel());

        retrievedAxis.setTickLabelsVisible(false);
        System.out.println("Tick Labels Visible: " + retrievedAxis.isTickLabelsVisible());
    }
}