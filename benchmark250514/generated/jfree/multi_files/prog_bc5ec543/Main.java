import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        LegendItemWrapper legendItemWrapper = new LegendItemWrapper("Sample Item");
        legendItemWrapper.setLegendItemLabelPaint(Color.RED);

        LegendItemProcessor legendItemProcessor = new LegendItemProcessor(legendItemWrapper.getLegendItem());
        Paint paint = legendItemProcessor.getLegendItemLabelPaint();

        System.out.println("Legend Item Paint: " + paint);
    }
}