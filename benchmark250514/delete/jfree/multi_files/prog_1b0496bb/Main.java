public class Main {
    public static void main(String[] args) {
        ChartConfiguration chartConfig = new ChartConfiguration();
        chartConfig.configurePiePlot();
        
        PiePlot piePlot = chartConfig.getPiePlot();
        ChartAnalyzer chartAnalyzer = new ChartAnalyzer(piePlot);
        chartAnalyzer.analyze();
    }
}