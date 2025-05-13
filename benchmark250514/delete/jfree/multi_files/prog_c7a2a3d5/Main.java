public class Main {
    public static void main(String[] args) {
        PiePlotWrapper piePlotWrapper = new PiePlotWrapper();
        piePlotWrapper.setLabelPaint();

        ChartManager chartManager = new ChartManager();
        chartManager.performCalculations();

        /* read */ Paint readLabelPaint = piePlotWrapper.getLabelPaint();
        System.out.println("Label paint color: " + readLabelPaint);
    }
}