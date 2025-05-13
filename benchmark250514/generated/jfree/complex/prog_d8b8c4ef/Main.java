import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.XYPlot;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        CategoryPlot categoryPlot = new CategoryPlot();
        XYPlot xyPlot = new XYPlot();
        
        /* write */ piePlot.setSectionOutlinesVisible(true);
        
        categoryPlot.setDomainGridlinesVisible(false);
        xyPlot.setDomainGridlinesVisible(true);
        
        boolean categoryGridlinesVisible = categoryPlot.isDomainGridlinesVisible();
        boolean xyGridlinesVisible = xyPlot.isDomainGridlinesVisible();
        
        if (categoryGridlinesVisible) {
            System.out.println("Category gridlines are visible.");
        } else {
            System.out.println("Category gridlines are not visible.");
        }
        
        if (xyGridlinesVisible) {
            System.out.println("XY gridlines are visible.");
        } else {
            System.out.println("XY gridlines are not visible.");
        }
        
        // Complex logic using PiePlot
        int numberOfSections = 5;
        for (int i = 0; i < numberOfSections; i++) {
            piePlot.setSectionOutlinesVisible(i % 2 == 0);
        }
        
        /* read */ boolean outlinesVisible = piePlot.getSectionOutlinesVisible();
        System.out.println("Outlines visible: " + outlinesVisible);
        
        // Additional complex logic
        double[] dataValues = {1.0, 2.5, 3.0, 4.5, 5.0};
        double total = 0;
        for (double value : dataValues) {
            total += value;
        }
        
        double average = total / dataValues.length;
        System.out.println("Average value: " + average);
    }
}