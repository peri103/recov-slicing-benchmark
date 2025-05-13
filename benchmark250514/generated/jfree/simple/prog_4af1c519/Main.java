import org.jfree.chart.renderer.category.BarRenderer;

public class Main {
    public static void main(String[] args) {
        // Initialize the BarRenderer object
        BarRenderer renderer = new BarRenderer();
        
        // Set the base value using the write method
        /* write */ renderer.setBase(5.0);
        
        // Retrieve the base value using the read method
        /* read */ double baseValue = renderer.getBase();
        
        // Print the retrieved value
        System.out.println(baseValue);
    }
}