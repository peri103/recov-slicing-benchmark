import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GzipManager gzipManager = new GzipManager();
        DataProcessor dataProcessor = new DataProcessor();
        
        Date modificationTime = new Date();
        gzipManager.setModificationTime(modificationTime);

        int sum = dataProcessor.calculateSum();
        int mapValue = dataProcessor.getMapValue("Two");
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Value from map: " + mapValue);

        dataProcessor.updateNumbers(mapValue);

        int updatedSum = dataProcessor.calculateUpdatedSum();
        System.out.println("Updated sum of numbers: " + updatedSum);

        /* read */ Date readModificationTime = gzipManager.getModificationTime();
        System.out.println("Modification Time: " + readModificationTime);
    }
}