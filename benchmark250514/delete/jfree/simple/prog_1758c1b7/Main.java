import org.jfree.chart.LegendItem;

public class Main {
    public static void main(String[] args) {
        // Initialize a LegendItem object
        LegendItem legendItem = new LegendItem("Initial Label");

        // Set the label using the write method
        /* write */ legendItem.setLabel("New Label");

        // Read the label using the read method
        /* read */ String label = legendItem.getLabel();

        // Print the label to ensure the read method retrieves the correct value
        System.out.println(label);
    }
}