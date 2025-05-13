import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.CategoryAxis;

public class Main {
    public static void main(String[] args) {
        Axis axis = new CategoryAxis();
        /* write */ axis.setLabel("X-Axis Label");
        /* read */ String label = axis.getLabel();
        System.out.println(label);
    }
}