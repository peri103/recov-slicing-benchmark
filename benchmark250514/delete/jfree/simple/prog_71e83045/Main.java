import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        Paint domainPaint = new Color(255, 0, 0); // Red color
        /* write */ renderer.setDomainPaint(domainPaint);
        /* read */ Paint readDomainPaint = renderer.getDomainPaint();
        System.out.println(readDomainPaint);
    }
}