import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Main {
    public static void main(String[] args) {
        SpiderWebPlot plot = new SpiderWebPlot(null); // Assuming null dataset for simplicity
        PiePlot piePlot = new PiePlot(new DefaultPieDataset());
        CategoryPlot categoryPlot = new CategoryPlot();
        
        /* write */ plot.setHeadPercent(0.75);
        
        piePlot.setSectionOutlinesVisible(true);
        piePlot.setLabelGenerator(null);
        
        categoryPlot.setRangeGridlinesVisible(true);
        categoryPlot.setDomainGridlinesVisible(false);

        JFreeChart chart = new JFreeChart("Complex Chart", JFreeChart.DEFAULT_TITLE_FONT, categoryPlot, true);
        chart.setBackgroundPaint(null);
        
        double pieOutlineVisibility = piePlot.isSectionOutlinesVisible() ? 1.0 : 0.0;
        double categoryRangeVisibility = categoryPlot.isRangeGridlinesVisible() ? 1.0 : 0.0;
        
        System.out.println("Pie Plot Outline Visibility: " + pieOutlineVisibility);
        System.out.println("Category Plot Range Visibility: " + categoryRangeVisibility);
        
        /* read */ double headPercent = plot.getHeadPercent();
        System.out.println("Spider Web Plot Head Percent: " + headPercent);
        
        categoryPlot.setDomainGridlinesVisible(true);
        categoryPlot.setRangeGridlinesVisible(false);
        
        System.out.println("Chart background paint: " + chart.getBackgroundPaint());
        
        piePlot.setSectionOutlinesVisible(false);
        System.out.println("Updated Pie Plot Outline Visibility: " + piePlot.isSectionOutlinesVisible());
    }
}