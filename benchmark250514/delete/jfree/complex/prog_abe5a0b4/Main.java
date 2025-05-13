import org.jfree.chart.plot.Plot;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.plot.CategoryPlot;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a custom plot and dataset
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return "Custom Plot";
            }
        };

        Dataset dataset = new DefaultPieDataset();
        
        // Step 2: Work with a pie chart
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Category A", 40);
        pieDataset.setValue("Category B", 30);
        pieDataset.setValue("Category C", 30);
        
        JFreeChart pieChart = ChartFactory.createPieChart(
            "Sample Pie Chart", 
            pieDataset, 
            true, 
            true, 
            false
        );
        
        PiePlot piePlot = (PiePlot) pieChart.getPlot();
        piePlot.setSectionPaint("Category A", new java.awt.Color(255, 0, 0));
        piePlot.setSectionPaint("Category B", new java.awt.Color(0, 255, 0));
        piePlot.setSectionPaint("Category C", new java.awt.Color(0, 0, 255));
        
        // Step 3: Work with a category plot
        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
        categoryDataset.addValue(1.0, "Row 1", "Column 1");
        categoryDataset.addValue(4.0, "Row 1", "Column 2");
        categoryDataset.addValue(3.0, "Row 1", "Column 3");
        
        JFreeChart categoryChart = ChartFactory.createBarChart(
            "Sample Category Chart", 
            "Category", 
            "Value", 
            categoryDataset
        );
        
        CategoryPlot categoryPlot = categoryChart.getCategoryPlot();
        categoryPlot.setRangeGridlinePaint(new java.awt.Color(128, 128, 128));
        
        // Step 4: Set the dataset to the plot
        /* write */ plot.setDataset(dataset);
        
        // Step 5: Perform unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum from 0 to 9: " + sum);
        
        // Step 6: Retrieve the dataset from the plot
        /* read */ Dataset retrievedDataset = plot.getDataset();
        
        System.out.println("Dataset set and retrieved successfully: " + (retrievedDataset == dataset));
        
        // Step 7: More operations unrelated to the original write-read pair
        double squareSum = 0;
        for (int i = 0; i < 5; i++) {
            squareSum += Math.pow(i, 2);
        }
        System.out.println("Sum of squares from 0 to 4: " + squareSum);
    }
}