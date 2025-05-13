import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.CategoryPlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        Paint paint = Color.RED;
        
        CategoryPlot categoryPlot = new CategoryPlot();
        List<String> categories = new ArrayList<>();
        
        categories.add("Category 1");
        categories.add("Category 2");
        categories.add("Category 3");
        
        categoryPlot.setDataset(0, null);
        categoryPlot.setOutlinePaint(0, Color.BLUE);
        
        /* write */ piePlot.setOutlinePaint(paint);
        
        // Some unrelated operations to increase complexity
        for (String category : categories) {
            System.out.println("Processing " + category);
            categoryPlot.setOutlinePaint(categories.indexOf(category), Color.GREEN);
        }
        
        List<Paint> paints = new ArrayList<>();
        for (int i = 0; i < categories.size(); i++) {
            paints.add(categoryPlot.getOutlinePaint(i));
        }
        
        // More complex operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers is: " + sum);
        
        /* read */ Paint readPaint = piePlot.getOutlinePaint();
        
        System.out.println("PiePlot outline paint: " + readPaint);
        
        // Further operations
        for (Paint p : paints) {
            System.out.println("CategoryPlot outline paint: " + p);
        }
    }
}