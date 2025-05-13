import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.XYPlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return "Custom Plot";
            }
        };

        CategoryPlot categoryPlot = new CategoryPlot();
        XYPlot xyPlot = new XYPlot();

        /* write */ plot.setOutlinePaint(Color.RED);

        List<Plot> plotList = new ArrayList<>();
        plotList.add(plot);
        plotList.add(categoryPlot);
        plotList.add(xyPlot);

        // Setting outline paint for category plot
        categoryPlot.setOutlinePaint(Color.BLUE);

        // Setting outline paint for xy plot
        xyPlot.setOutlinePaint(Color.GREEN);

        for (Plot p : plotList) {
            Paint paint = p.getOutlinePaint();
            System.out.println("Outline Paint: " + paint);
        }

        // Some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // More unrelated operations
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        for (String name : names) {
            System.out.println("Hello, " + name);
        }

        /* read */ Paint outlinePaint = plot.getOutlinePaint();
        System.out.println("Original Plot Outline Paint: " + outlinePaint);
    }
}