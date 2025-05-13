public class Main {
    public static void main(String[] args) {
        AxisManager manager = new AxisManager("Main Axis");
        manager.configureAxisBase(10.0);

        double logValue = manager.computeLogarithm(100.0);
        System.out.println("Logarithm of 100: " + logValue);

        double base = manager.getAxisBase();
        System.out.println("Base of the axis: " + base);
    }
}