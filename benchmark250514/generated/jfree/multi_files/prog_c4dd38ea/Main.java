public class Main {
    public static void main(String[] args) {
        ChartSettings chartSettings = new ChartSettings();
        chartSettings.setLabelWidth(0.25);

        ChartAnalyzer chartAnalyzer = new ChartAnalyzer(chartSettings.getPiePlot());
        double maxLabelWidth = chartAnalyzer.analyzeLabelWidth();
        System.out.println("Maximum label width from analyzer: " + maxLabelWidth);

        for (int i = 0; i < 5; i++) {
            double scaleFactor = 0.1 * i;
            chartSettings.setLabelWidth(scaleFactor);
            System.out.println("Adjusted label width: " + chartAnalyzer.analyzeLabelWidth());
        }
    }
}