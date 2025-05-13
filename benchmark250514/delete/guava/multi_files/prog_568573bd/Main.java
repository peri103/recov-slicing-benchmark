public class Main {
    public static void main(String[] args) {
        ColorManager colorManager = new ColorManager();

        // Add colors
        colorManager.addColor(ColorMultiset.Color.RED);
        colorManager.addColor(ColorMultiset.Color.GREEN);
        colorManager.addColor(ColorMultiset.Color.BLUE);
        colorManager.addColor(ColorMultiset.Color.RED);

        // Update color counts in the manager
        colorManager.updateColorCounts();

        // Perform unrelated operations
        int totalColors = 0;
        for (int count : colorManager.getAllColorCounts().values()) {
            totalColors += count;
        }
        System.out.println("Total colors counted: " + totalColors);

        // Get the count of RED color
        /* read */ int countRed = colorManager.getColorCount(ColorMultiset.Color.RED);

        // Print the count of RED
        System.out.println("Count of RED: " + countRed);

        // Print all color counts
        for (Map.Entry<ColorMultiset.Color, Integer> entry : colorManager.getAllColorCounts().entrySet()) {
            System.out.println("Color " + entry.getKey() + " has count: " + entry.getValue());
        }
    }
}