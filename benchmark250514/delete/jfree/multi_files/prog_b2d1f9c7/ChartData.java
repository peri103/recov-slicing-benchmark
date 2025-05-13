import org.jfree.data.category.DefaultCategoryDataset;

public class ChartData {
    private DefaultCategoryDataset dataset;

    public ChartData() {
        dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row 1", "Column 1");
        dataset.addValue(5.0, "Row 1", "Column 2");
        dataset.addValue(3.0, "Row 1", "Column 3");
    }

    public DefaultCategoryDataset getDataset() {
        return dataset;
    }
}
