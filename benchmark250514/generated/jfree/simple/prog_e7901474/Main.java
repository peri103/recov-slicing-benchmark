import org.jfree.chart.renderer.category.BarRenderer;

public class Main {
    public static void main(String[] args) {
        BarRenderer renderer = new BarRenderer();
        /* write */ renderer.setBase(10.0);
        /* read */ double baseValue = renderer.getBase();
        System.out.println(baseValue);
    }
}