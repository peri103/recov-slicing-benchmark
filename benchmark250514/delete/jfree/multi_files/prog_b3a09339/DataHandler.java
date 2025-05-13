import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.DefaultCategoryDataset;

public class DataHandler {
    private CustomPlot plot = new CustomPlot();

    public void initializePieDataset() {
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Category 1", 43.2);
        pieDataset.setValue("Category 2", 27.9);
        pieDataset.setValue("Category 3", 29.0);
        plot.setDataset(pieDataset);
    }

    public void initializeCategoryDataset() {
        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
        categoryDataset.addValue(1.0, "Row 1", "Column 1");
        categoryDataset.addValue(5.0, "Row 1", "Column 2");
        categoryDataset.addValue(3.0, "Row 1", "Column 3");
        plot.setDataset(categoryDataset);
    }

    public CustomPlot getPlot() {
        return plot;
    }
}
