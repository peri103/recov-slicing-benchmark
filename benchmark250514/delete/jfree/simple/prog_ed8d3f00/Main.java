import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        /* write */ renderer.setDomainPaint(Color.BLUE);
        /* read */ Paint domainPaint = renderer.getDomainPaint();
        System.out.println(domainPaint);
    }
}