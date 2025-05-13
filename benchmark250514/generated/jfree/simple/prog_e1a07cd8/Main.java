import org.jfree.chart.renderer.xy.StackedXYBarRenderer;

public class Main {
    public static void main(String[] args) {
        StackedXYBarRenderer renderer = new StackedXYBarRenderer();
        /* write */ renderer.setBase(10.0);
        /* read */ double baseValue = renderer.getBase();
        System.out.println(baseValue);
    }
}