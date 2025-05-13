import org.jfree.chart.axis.Axis;

public class Main {
    public static void main(String[] args) {
        Axis axis = new Axis("Initial Label") {
            @Override
            public void configure() {
                // Implementation not required for this example
            }
        };
        /* write */ axis.setLabel("Updated Label");
        /* read */ String label = axis.getLabel();
        System.out.println(label);
    }
}