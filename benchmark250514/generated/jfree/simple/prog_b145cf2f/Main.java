import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        Axis axis = new NumberAxis();
        /* write */ axis.setTickLabelsVisible(true);
        /* read */ boolean isVisible = axis.isTickLabelsVisible();
        System.out.println(isVisible);
    }
}