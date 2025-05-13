import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        NumberAxis domainAxis = new NumberAxis("Domain");
        NumberAxis rangeAxis = new NumberAxis("Range");
        
        plot.setDomainAxis(domainAxis);
        plot.setRangeAxis(rangeAxis);
        
        ArrayList<Paint> paintList = new ArrayList<>();
        paintList.add(Color.BLUE);
        paintList.add(Color.GREEN);
        
        for (Paint paint : paintList) {
            plot.setRangeGridlinePaint(paint);
        }
        
        /* write */ plot.setRangeGridlinePaint(Color.RED);
        
        ArrayList<XYPlot> plotList = new ArrayList<>();
        plotList.add(plot);
        
        for (XYPlot p : plotList) {
            Paint currentPaint = p.getRangeGridlinePaint();
            System.out.println("Current paint before read: " + currentPaint);
        }
        
        // Some unrelated operations to make the program more complex
        for (int i = 0; i < 5; i++) {
            NumberAxis tempAxis = new NumberAxis("Temp " + i);
            plot.setDomainAxis(tempAxis);
        }

        /* read */ Paint paint = plot.getRangeGridlinePaint();
        
        System.out.println("Read paint: " + paint);
        
        // Additional operations
        for (int i = 0; i < 3; i++) {
            plot.setRangeGridlinePaint(paintList.get(i % paintList.size()));
            System.out.println("Paint after additional operations: " + plot.getRangeGridlinePaint());
        }
    }
}