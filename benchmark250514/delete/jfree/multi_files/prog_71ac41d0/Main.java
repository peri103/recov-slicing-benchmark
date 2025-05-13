public class Main {
    public static void main(String[] args) {
        ChartManager chartManager = new ChartManager();
        
        // Configure visibility
        chartManager.setRendererVisibility(true);
        
        // Check visibility and print the result
        boolean isVisible = chartManager.checkRendererVisibility();
        System.out.println("Renderer Base Shapes Visible: " + isVisible);
    }
}