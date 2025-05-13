public class Main {
    public static void main(String[] args) {
        CustomNumberAxis customAxis = new CustomNumberAxis();
        customAxis.setCustomTickUnit(10.0);

        DataModel dataModel = new DataModel(customAxis, 10);
        double[] data = dataModel.getData();

        /* read */ double tickUnitSize = customAxis.getNumberAxis().getTickUnit().getSize();
        System.out.println("Tick Unit Size: " + tickUnitSize);

        for (double d : data) {
            System.out.println("Data Value: " + d);
        }
    }
}