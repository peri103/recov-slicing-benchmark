public class Main {
    public static void main(String[] args) {
        ChartRenderer chartRenderer = new ChartRenderer();
        DataAnalyzer dataAnalyzer = new DataAnalyzer();

        for (int i = 0; i < 5; i++) {
            dataAnalyzer.addDataValue(i * 10);
        }

        chartRenderer.configureRenderer(true);

        int sum = dataAnalyzer.calculateSum();
        System.out.println("Sum of data values: " + sum);

        /* read */ boolean drawOutlines = chartRenderer.getShapeRenderer().getDrawOutlines();
        System.out.println("Draw outlines: " + drawOutlines);
    }
}