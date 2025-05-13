public class Main {
    public static void main(String[] args) {
        PiePlotVisibility piePlotVisibility = new PiePlotVisibility();
        ComplexPlotOperations complexPlotOperations = new ComplexPlotOperations();
        DataAnalyzer dataAnalyzer = new DataAnalyzer(new double[]{1.0, 2.5, 3.0, 4.5, 5.0});

        piePlotVisibility.setOutlinesVisible(true);
        complexPlotOperations.toggleGridlines();

        if (complexPlotOperations.areCategoryGridlinesVisible()) {
            System.out.println("Category gridlines are visible.");
        } else {
            System.out.println("Category gridlines are not visible.");
        }

        if (complexPlotOperations.areXYGridlinesVisible()) {
            System.out.println("XY gridlines are visible.");
        } else {
            System.out.println("XY gridlines are not visible.");
        }

        double average = dataAnalyzer.calculateAverage();
        System.out.println("Average value: " + average);

        /* read */ boolean outlinesVisible = piePlotVisibility.getOutlinesVisible();
        System.out.println("Outlines visible: " + outlinesVisible);
    }
}