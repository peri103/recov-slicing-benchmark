import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;

public class ChartManager {
    private CategoryPlot categoryPlot;

    public ChartManager() {
        categoryPlot = new CategoryPlot();
        CategoryAxis categoryAxis = new CategoryAxis("Category");
        ValueAxis valueAxis = new ValueAxis("Value") {};
        categoryPlot.setDomainAxis(categoryAxis);
        categoryPlot.setRangeAxis(valueAxis);
    }

    public void performCalculations() {
        int[] values = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        System.out.println("Sum of values: " + sum);

        for (int i = 0; i < values.length; i++) {
            values[i] *= 2;
        }

        for (int value : values) {
            System.out.println("Modified value: " + value);
        }
    }
}
