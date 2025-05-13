import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Paint shadowPaint = Color.GRAY;

        ArrayList<Paint> paintList = new ArrayList<>();
        paintList.add(Color.RED);
        paintList.add(Color.BLUE);
        paintList.add(Color.GREEN);

        Map<String, Paint> paintMap = new HashMap<>();
        paintMap.put("Background", Color.WHITE);
        paintMap.put("Foreground", Color.BLACK);

        /* write */ plot.setLabelShadowPaint(shadowPaint);

        for (Paint paint : paintList) {
            plot.setLabelShadowPaint(paint);
        }

        Paint readShadowPaint = plot.getLabelShadowPaint();
        System.out.println("Current label shadow paint: " + readShadowPaint);

        for (Map.Entry<String, Paint> entry : paintMap.entrySet()) {
            System.out.println("Paint for " + entry.getKey() + ": " + entry.getValue());
        }

        Paint newShadowPaint = Color.YELLOW;
        plot.setLabelShadowPaint(newShadowPaint);
        Paint updatedShadowPaint = plot.getLabelShadowPaint();
        System.out.println("Updated label shadow paint: " + updatedShadowPaint);
    }
}