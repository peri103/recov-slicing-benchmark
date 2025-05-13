import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.plot.CategoryPlot;

public class Main {
    public static void main(String[] args) {
        // Initialize a dataset for PiePlot
        Dataset pieDataset = new DefaultPieDataset();
        
        // Create a PiePlot instance
        Plot piePlot = new PiePlot();
        
        /* write */ piePlot.setDataset(pieDataset);

        // Initialize another dataset for CategoryPlot
        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
        categoryDataset.addValue(1.0, "Row1", "Column1");
        categoryDataset.addValue(2.0, "Row2", "Column2");
        
        // Create a CategoryPlot instance
        CategoryPlot categoryPlot = new CategoryPlot();
        categoryPlot.setDataset(categoryDataset);
        
        // Perform operations on the CategoryPlot
        System.out.println("CategoryPlot Dataset: " + categoryPlot.getDataset().getValue("Row1", "Column1"));
        
        // Perform unrelated operations to increase complexity
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println("Sum of first 100 numbers: " + sum);

        // Perform some operations on the PiePlot before reading
        System.out.println("PiePlot Dataset class: " + piePlot.getDataset().getClass().getName());
        
        /* read */ Dataset readDataset = piePlot.getDataset();
        
        // Verify that the dataset read is the same as the one written
        System.out.println(readDataset == pieDataset ? "Success" : "Failure");
        
        // Additional operations to make the program more complex
        double product = 1.0;
        for (int i = 1; i <= 10; i++) {
            product *= i;
        }
        System.out.println("Product of first 10 numbers: " + product);
    }
}