import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.XYPlot;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return null;
            }
        };

        CategoryPlot categoryPlot = new CategoryPlot();
        XYPlot xyPlot = new XYPlot();

        /* write */ plot.setOutlinePaint(Color.RED);

        categoryPlot.setOutlinePaint(Color.BLUE);
        xyPlot.setOutlinePaint(Color.GREEN);

        Paint categoryOutlinePaint = categoryPlot.getOutlinePaint();
        Paint xyOutlinePaint = xyPlot.getOutlinePaint();

        System.out.println("Category Plot Outline Paint: " + categoryOutlinePaint);
        System.out.println("XY Plot Outline Paint: " + xyOutlinePaint);

        // Some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // More unrelated operations
        StringBuilder sb = new StringBuilder();
        sb.append("Complexity added");
        sb.append(" with some string operations.");
        System.out.println(sb.toString());

        /* read */ java.awt.Paint outlinePaint = plot.getOutlinePaint();
        System.out.println("Plot Outline Paint: " + outlinePaint);
    }
}