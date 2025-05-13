import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        Axis axis = new NumberAxis();
        
        /* write */ axis.setLabel("Sample Label");
        
        /* read */ String label = axis.getLabel();
        
        System.out.println(label);
    }
}