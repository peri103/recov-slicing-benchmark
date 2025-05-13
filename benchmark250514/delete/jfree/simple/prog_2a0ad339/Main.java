import org.jfree.chart.axis.SymbolAxis;

public class Main {
    public static void main(String[] args) {
        double[] range = {0.0, 1.0};
        String[] symbols = {"A", "B"};
        SymbolAxis symbolAxis = new SymbolAxis("Example Axis", symbols);
        
        /* write */ symbolAxis.setTickLabelsVisible(true);
        /* read */ boolean isVisible = symbolAxis.getTickLabelsVisible();
        
        System.out.println("Tick labels visible: " + isVisible);
    }
}