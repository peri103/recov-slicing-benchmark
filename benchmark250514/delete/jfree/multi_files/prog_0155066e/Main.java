public class Main {
    public static void main(String[] args) {
        StrokeManager strokeManager = new StrokeManager();
        ColorManager colorManager = new ColorManager();

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 integers: " + sum);

        // Read series stroke from StrokeManager
        /* read */ Stroke readStepStroke = strokeManager.getRendererStroke();
        System.out.println("Step Area Renderer Series Stroke equals original: " + readStepStroke.equals(strokeManager.getStepStroke()));

        // Read series paint from ColorManager
        Color readColor = colorManager.getSeriesPaint(0);
        System.out.println("Line Renderer Series Paint: " + readColor.toString());
    }
}