public class Main {
    public static void main(String[] args) {
        PaintManager manager = new PaintManager();
        manager.setPositivePaint();

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 99: " + sum);

        PaintAnalyzer analyzer = new PaintAnalyzer(manager.getRenderer());
        analyzer.analyze();

        // Perform more unrelated calculations
        int product = 1;
        for (int i = 1; i <= 10; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 10: " + product);
    }
}