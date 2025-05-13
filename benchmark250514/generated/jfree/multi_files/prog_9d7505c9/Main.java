public class Main {
    public static void main(String[] args) {
        PiePlotManager manager = new PiePlotManager();
        manager.configurePlot();

        PaintDisplay display = new PaintDisplay(manager.getPlot());
        display.displayLabelBackgroundPaint();
    }
}