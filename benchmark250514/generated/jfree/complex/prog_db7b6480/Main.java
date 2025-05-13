import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();
        NumberAxis domainAxis = new NumberAxis("X");
        NumberAxis rangeAxis = new NumberAxis("Y");
        
        plot.setDomainAxis(domainAxis);
        plot.setRangeAxis(rangeAxis);
        
        ArrayList<Paint> paintList = new ArrayList<>();
        paintList.add(Color.RED);
        paintList.add(Color.GREEN);
        paintList.add(Color.BLUE);
        
        for (Paint p : paintList) {
            plot.setDomainGridlinePaint(p);
            System.out.println("Domain Gridline Paint: " + plot.getDomainGridlinePaint());
        }
        
        /* write */ plot.setRangeGridlinePaint(Color.BLUE);
        
        int axisCount = 0;
        if (plot.getDomainAxis() != null) {
            axisCount++;
        }
        if (plot.getRangeAxis() != null) {
            axisCount++;
        }
        System.out.println("Number of axes: " + axisCount);
        
        ArrayList<NumberAxis> axisList = new ArrayList<>();
        axisList.add(domainAxis);
        axisList.add(rangeAxis);
        
        for (NumberAxis axis : axisList) {
            System.out.println("Axis label: " + axis.getLabel());
        }
        
        /* read */ Paint paint = plot.getRangeGridlinePaint();
        System.out.println("Range Gridline Paint: " + paint);
        
        plot.setDomainGridlinePaint(Color.YELLOW);
        plot.setRangeGridlinePaint(Color.ORANGE);
        
        System.out.println("Domain Gridline Paint after change: " + plot.getDomainGridlinePaint());
        System.out.println("Range Gridline Paint after change: " + plot.getRangeGridlinePaint());
    }
}