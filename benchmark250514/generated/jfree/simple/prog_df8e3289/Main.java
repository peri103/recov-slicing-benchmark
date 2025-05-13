import org.jfree.chart.renderer.category.BarRenderer;

public class Main {
    public static void main(String[] args) {
        BarRenderer barRenderer = new BarRenderer();
        
        /* write */ barRenderer.setBase(5.0);
        
        /* read */ double baseValue = barRenderer.getBase();
        System.out.println(baseValue);
    }
}