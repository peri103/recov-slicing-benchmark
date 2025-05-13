import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.JFrame;

public class ChartDisplay {
    private ChartPlotter plotter;
    private JFreeChart chart;

    public ChartDisplay(ChartPlotter plotter) {
        this.plotter = plotter;
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Series1", "Category1");
        dataset.addValue(5.0, "Series1", "Category2");
        dataset.addValue(3.0, "Series1", "Category3");
        
        this.chart = ChartFactory.createBarChart(
            "Sample Chart", 
            "Category", 
            "Value", 
            dataset
        );
        this.chart.setCategoryPlot(plotter.getPlot());
    }

    public void displayChart() {
        JFrame frame = new JFrame("Chart Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(chart));
        frame.pack();
        frame.setVisible(true);
    }
}
