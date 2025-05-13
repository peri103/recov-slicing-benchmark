import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;

public class ChartManager {
    private JFreeChart chart;
    private DefaultCategoryDataset dataset;

    public ChartManager() {
        dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row1", "Column1");
        dataset.addValue(4.0, "Row1", "Column2");
        dataset.addValue(3.0, "Row1", "Column3");

        chart = ChartFactory.createBarChart(
                "Sample Chart",
                "Category",
                "Value",
                dataset
        );
    }

    public JFreeChart getChart() {
        return chart;
    }

    public void updateDataset(double value, String rowKey, String columnKey) {
        dataset.addValue(value, rowKey, columnKey);
    }
}