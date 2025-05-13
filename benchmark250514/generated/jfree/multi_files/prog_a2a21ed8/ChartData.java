import org.jfree.data.category.DefaultCategoryDataset;

public class ChartData {
    private DefaultCategoryDataset dataset;

    public ChartData() {
        this.dataset = new DefaultCategoryDataset();
    }

    public void addValue(double value, String series, String category) {
        dataset.addValue(value, series, category);
    }

    public DefaultCategoryDataset getDataset() {
        return this.dataset;
    }
}
