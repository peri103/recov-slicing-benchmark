import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        RendererManager manager = new RendererManager();
        manager.configureRenderer();
        
        // Update the paint for a specific series
        manager.updateSeriesPaint(0, Color.RED);
        
        // Analyze the renderer
        RendererAnalyzer analyzer = new RendererAnalyzer(manager.getRenderer());
        analyzer.analyzeRenderer();
        
        // Retrieve and print the updated paint for series 0
        Color updatedPaint = (Color) analyzer.getSeriesPaint(0);
        System.out.println("Updated paint for series 0: " + updatedPaint);
    }
}