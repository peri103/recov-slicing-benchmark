import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.CategoryAxis;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        CategoryPlot categoryPlot = new CategoryPlot();
        NumberAxis numberAxis = new NumberAxis();
        CategoryAxis categoryAxis = new CategoryAxis();

        /* write */ piePlot.setMaximumLabelWidth(0.25);

        numberAxis.setRange(0.0, 100.0);
        categoryAxis.setCategoryMargin(0.10);
        categoryPlot.setDomainAxis(categoryAxis);
        categoryPlot.setRangeAxis(numberAxis);

        double totalValue = 0.0;
        for (int i = 0; i < 10; i++) {
            double value = Math.random() * 10;
            totalValue += value;
            categoryPlot.setDataset(i, null); // Placeholder for dataset assignment
        }

        double averageValue = totalValue / 10;
        System.out.println("Average value: " + averageValue);

        /* read */ double maxLabelWidth = piePlot.getMaximumLabelWidth();
        System.out.println("Maximum label width: " + maxLabelWidth);

        for (int i = 0; i < 5; i++) {
            double scaleFactor = 0.1 * i;
            piePlot.setMaximumLabelWidth(scaleFactor);
            System.out.println("Adjusted label width: " + piePlot.getMaximumLabelWidth());
        }
    }
}