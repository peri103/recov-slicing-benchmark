public class Main {
    public static void main(String[] args) {
        ChartSettings settings = new ChartSettings();
        settings.configurePlot();
        
        PiePlot plot = settings.getPlot();
        ChartReader reader = new ChartReader(plot);
        reader.displayShadowPaint();
    }
}