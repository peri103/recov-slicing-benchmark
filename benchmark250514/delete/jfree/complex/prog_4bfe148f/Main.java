import org.jfree.chart.plot.Plot;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        // Create a custom plot and dataset
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return "Custom Plot";
            }
        };
        
        Dataset dataset = new DefaultPieDataset();
        /* write */ plot.setDataset(dataset);

        // Create a CategoryPlot with a DefaultCategoryDataset
        CategoryPlot categoryPlot = new CategoryPlot();
        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
        categoryDataset.addValue(1.0, "Row1", "Column1");
        categoryPlot.setDataset(categoryDataset);

        // Create an XYPlot with an XYSeriesCollection
        XYPlot xyPlot = new XYPlot();
        XYSeries series = new XYSeries("Series1");
        series.add(1.0, 2.0);
        XYSeriesCollection xyDataset = new XYSeriesCollection(series);
        xyPlot.setDataset(xyDataset);

        // Perform some operations on the category plot
        categoryPlot.setForegroundAlpha(0.5f);
        categoryPlot.getRangeAxis().setLabel("Value Axis");

        // Perform some operations on the XY plot
        xyPlot.setRangeCrosshairVisible(true);
        xyPlot.getDomainAxis().setLabel("Domain Axis");

        // Retrieve the dataset from the original plot
        /* read */ Dataset retrievedDataset = plot.getDataset();
        
        System.out.println(retrievedDataset != null ? "Dataset set and retrieved successfully." : "Failed to retrieve dataset.");

        // Additional operations to make the program more complex
        for (int i = 0; i < 5; i++) {
            categoryDataset.addValue(i * 2.0, "Row" + i, "Column" + i);
            series.add(i + 1.0, i * 3.0);
        }

        // Print the datasets to verify their contents
        System.out.println("Category Dataset Row Count: " + categoryDataset.getRowCount());
        System.out.println("XY Series Item Count: " + series.getItemCount());
    }
}