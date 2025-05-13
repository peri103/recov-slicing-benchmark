import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return null;
            }
        };
        
        ArrayList<Plot> plotList = new ArrayList<>();
        PiePlot piePlot = new PiePlot();
        
        plotList.add(plot);
        plotList.add(piePlot);

        /* write */ plot.setBackgroundPaint(Color.BLUE);
        
        piePlot.setSectionPaint("Section1", Color.RED);
        piePlot.setSectionPaint("Section2", Color.GREEN);
        
        for (Plot p : plotList) {
            if (p instanceof PiePlot) {
                PiePlot pp = (PiePlot) p;
                Paint sectionPaint = pp.getSectionPaint("Section1");
                System.out.println("PiePlot Section1 Paint: " + sectionPaint);
            }
        }
        
        /* read */ Paint backgroundPaint = plot.getBackgroundPaint();
        
        System.out.println("Plot Background Paint: " + backgroundPaint);
        
        plot.setBackgroundPaint(Color.YELLOW);
        
        for (Plot p : plotList) {
            if (p instanceof PiePlot) {
                PiePlot pp = (PiePlot) p;
                Paint sectionPaint = pp.getSectionPaint("Section2");
                System.out.println("PiePlot Section2 Paint: " + sectionPaint);
            }
        }
    }
}