import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;

public class AxisManager {
    private CategoryAxis categoryAxis;

    public AxisManager() {
        this.categoryAxis = new CategoryAxis();
    }

    public void setLabelPositions(CategoryLabelPositions positions) {
        /* write */ categoryAxis.setCategoryLabelPositions(positions);
    }

    public CategoryLabelPositions getLabelPositions() {
        return categoryAxis.getCategoryLabelPositions();
    }
}