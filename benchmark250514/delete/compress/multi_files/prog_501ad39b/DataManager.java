import java.util.HashMap;
import java.util.ArrayList;

public class DataManager {
    private HashMap<String, Long> sizeMap = new HashMap<>();
    private ArrayList<Long> sizeList = new ArrayList<>();
    private CompressedData compressedData;

    public DataManager() {
        this.compressedData = new CompressedData();
    }

    public void initializeData() {
        sizeMap.put("file1", 2048L);
        sizeMap.put("file2", 4096L);
        sizeMap.put("file3", 8192L);

        sizeList.add(sizeMap.get("file1"));
        sizeList.add(sizeMap.get("file2"));
        sizeList.add(sizeMap.get("file3"));
    }

    public void calculateTotalSize() {
        long totalSize = 0;
        for (Long size : sizeList) {
            totalSize += size;
        }
        System.out.println("Total size: " + totalSize);
    }

    public void compressData() {
        compressedData.setCompressedSize(1024L);
        sizeMap.put("compressed", compressedData.getCompressedSize());
        sizeList.add(sizeMap.get("compressed"));
    }

    public void calculateTotalSizeAfterCompression() {
        long totalSize = 0;
        for (Long size : sizeList) {
            totalSize += size;
        }
        System.out.println("Total size after compression: " + totalSize);
    }

    public void printSizes() {
        for (int i = 0; i < sizeList.size(); i++) {
            System.out.println("Size at index " + i + ": " + sizeList.get(i));
        }
    }

    public CompressedData getCompressedData() {
        return compressedData;
    }
}
