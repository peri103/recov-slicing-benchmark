import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        Axis axis = new CategoryAxis();
        Axis anotherAxis = new CategoryAxis();
        ValueAxis valueAxis = new NumberAxis();
        
        valueAxis.setRange(0.0, 100.0);
        anotherAxis.setLabel("Secondary Axis Label");
        
        /* write */ axis.setLabel("My Axis Label");
        
        String secondaryLabel = anotherAxis.getLabel();
        System.out.println("Secondary Axis Label: " + secondaryLabel);
        
        double lowerBound = valueAxis.getLowerBound();
        double upperBound = valueAxis.getUpperBound();
        System.out.println("Value Axis Range: " + lowerBound + " to " + upperBound);
        
        valueAxis.setTickLabelsVisible(true);
        anotherAxis.setTickLabelsVisible(false);
        
        /* read */ String label = axis.getLabel();
        System.out.println(label);
        
        valueAxis.setTickMarksVisible(true);
        System.out.println("Tick Marks Visibility: " + valueAxis.isTickMarksVisible());
    }
}