public class Main {
    public static void main(String[] args) {
        ChartRenderer chartRenderer = new ChartRenderer();
        RendererManager rendererManager = new RendererManager();

        // Configure renderers
        rendererManager.configureRenderers();
        
        // Set shapes visible for XYStepAreaRenderer
        chartRenderer.setSeriesShapesVisible(0, true);
        
        // Check visibility for other renderers
        boolean lineShapesVisible = rendererManager.isLineAndShapeRendererSeriesVisible(0);
        System.out.println("Line and Shape Renderer, Series 0 Shapes Visible: " + lineShapesVisible);

        Boolean barVisible = rendererManager.isBarRendererSeriesVisible(0);
        System.out.println("Bar Renderer, Series 0 Visible: " + barVisible);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Read the value from XYStepAreaRenderer
        /* read */ boolean stepAreaShapesVisible = chartRenderer.getStepAreaRenderer().getSeriesShapesVisible(0);
        System.out.println("Step Area Renderer, Series 0 Shapes Visible: " + stepAreaShapesVisible);

        // Additional logic to make the program more complex
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}