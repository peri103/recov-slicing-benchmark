import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return "Custom Plot";
            }

            @Override
            protected void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.awt.geom.Point2D anchor, org.jfree.chart.plot.PlotState parentState, org.jfree.chart.plot.PlotRenderingInfo info) {
                // Custom drawing code
            }
        };

        HashMap<String, Paint> paintMap = new HashMap<>();
        paintMap.put("default", Color.RED);
        paintMap.put("highlight", Color.GREEN);

        ArrayList<Paint> paintList = new ArrayList<>();
        paintList.add(Color.YELLOW);
        paintList.add(Color.ORANGE);
        
        /* write */ plot.setBackgroundPaint(Color.BLUE);

        Paint highlightPaint = paintMap.get("highlight");
        paintList.add(highlightPaint);

        for (Paint paint : paintList) {
            System.out.println("Paint in list: " + paint);
        }

        Paint defaultPaint = paintMap.get("default");
        System.out.println("Default Paint: " + defaultPaint);

        /* read */ Paint backgroundPaint = plot.getBackgroundPaint();
        System.out.println("Background Paint: " + backgroundPaint);

        paintList.add(backgroundPaint);

        for (Paint paint : paintList) {
            System.out.println("Updated Paint List: " + paint);
        }
    }
}