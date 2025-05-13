import org.jfree.chart.plot.SpiderWebPlot;
import java.awt.Color;
import java.awt.Font;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.labels.CategoryToolTipGenerator;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.JFreeChart;

public class Main {
    public static void main(String[] args) {
        SpiderWebPlot plot = new SpiderWebPlot(null);
        
        // Set a series paint
        /* write */ plot.setSeriesPaint(0, Color.RED);
        
        // Set additional properties to make the program more complex
        plot.setSeriesPaint(1, Color.BLUE);
        plot.setLabelFont(new Font("SansSerif", Font.BOLD, 12));
        plot.setToolTipGenerator(new StandardCategoryToolTipGenerator());
        
        // Create a chart with the plot and set a title
        JFreeChart chart = new JFreeChart("Spider Web Chart", JFreeChart.DEFAULT_TITLE_FONT, plot, false);
        TextTitle title = chart.getTitle();
        title.setFont(new Font("Serif", Font.BOLD, 18));
        
        // Perform some operations unrelated to the original write-read pair
        CategoryToolTipGenerator generator = plot.getToolTipGenerator();
        System.out.println("ToolTip Generator: " + generator);
        
        // Read the series paint
        /* read */ Color seriesPaint = (Color) plot.getSeriesPaint(0);
        
        // Output the read value
        System.out.println("Series Paint: " + seriesPaint);
        
        // Additional operations to increase complexity
        plot.setSeriesPaint(2, Color.GREEN);
        plot.setSeriesPaint(3, Color.YELLOW);
        
        // Output additional series paints
        System.out.println("Series Paint 1: " + plot.getSeriesPaint(1));
        System.out.println("Series Paint 2: " + plot.getSeriesPaint(2));
        System.out.println("Series Paint 3: " + plot.getSeriesPaint(3));
    }
}