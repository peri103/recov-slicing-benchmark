import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.category.CategoryDataset;

public class DataPlotter {
    private MultiplePiePlot plot;

    public DataPlotter() {
        // Creating a sample dataset for demonstration purposes
        CategoryDataset dataset = DatasetUtilities.createCategoryDataset(
            "Row", "Column", new double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}}
        );

        // Initialize the MultiplePiePlot with the dataset
        plot = new MultiplePiePlot(dataset);
    }

    public void configurePlot() {
        // Set the data extract order using the write method
        /* write */ plot.setDataExtractOrder(TableOrder.BY_ROW);
    }

    public MultiplePiePlot getPlot() {
        return plot;
    }
}
