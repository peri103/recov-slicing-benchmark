public class Main {
    public static void main(String[] args) {
        ChartPlot plot = new ChartPlot();
        ColorManager colorManager = new ColorManager();

        // Set background paint using ColorManager
        plot.setCustomBackgroundPaint(colorManager.getColor(2));

        // Perform operations on colors
        colorManager.printColors();
        int sumRed = colorManager.sumRedValues();
        System.out.println("Sum of Red values: " + sumRed);

        // Retrieve and print the background paint
        /* read */ Paint paint = plot.getCustomBackgroundPaint();
        System.out.println("Background Paint: " + paint);

        // Additional operations
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 10);
        }

        int sumNumbers = 0;
        for (int number : numberList) {
            sumNumbers += number;
        }
        System.out.println("Sum of numbers: " + sumNumbers);

        // Print each number
        for (int i = 0; i < numberList.size(); i++) {
            System.out.println("Number: " + numberList.get(i));
        }
    }
}