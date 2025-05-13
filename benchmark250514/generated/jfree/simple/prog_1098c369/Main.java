import org.jfree.chart.renderer.xy.StackedXYBarRenderer;

public class Main {
    public static void main(String[] args) {
        // Initialize the renderer
        StackedXYBarRenderer renderer = new StackedXYBarRenderer();

        // Set a base value using the write method
        /* write */ renderer.setBase(5.0);

        // Read the base value using the read method
        /* read */ double baseValue = renderer.getBase();

        // Print the base value to verify
        System.out.println(baseValue);
    }
}