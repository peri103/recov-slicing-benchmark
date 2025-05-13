import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        /* write */ renderer.setDomainPaint(Color.RED);
        /* read */ Color domainPaint = (Color) renderer.getDomainPaint();
        System.out.println(domainPaint);
    }
}