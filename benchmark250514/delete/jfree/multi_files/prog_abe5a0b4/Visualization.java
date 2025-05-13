import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.plot.CategoryPlot;

public class Visualization {
    public void createPieChart() {
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
    }

    public void createCategoryChart() {
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
    }
}