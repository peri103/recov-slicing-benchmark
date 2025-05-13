public class Main {
    public static void main(String[] args) {
        DataManager dataManager = new DataManager();
        dataManager.initializeData();
        dataManager.calculateTotalSize();
        dataManager.compressData();
        dataManager.calculateTotalSizeAfterCompression();
        dataManager.printSizes();

        // Read the compressed size
        CompressedData compressedData = dataManager.getCompressedData();
        /* read */ long compressedSize = compressedData.getCompressedSize();
        System.out.println("Compressed size: " + compressedSize);
    }
}