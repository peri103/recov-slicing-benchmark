import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        
        /* write */ gzipParameters.setUncompressedSize(1024L);
        
        ArrayList<Integer> sizesList = new ArrayList<>();
        sizesList.add(512);
        sizesList.add(1024);
        sizesList.add(2048);
        
        int totalSize = 0;
        for (int size : sizesList) {
            totalSize += size;
        }
        
        GzipParameters anotherGzipParameters = new GzipParameters();
        anotherGzipParameters.setUncompressedSize(totalSize);
        
        long anotherUncompressedSize = anotherGzipParameters.getUncompressedSize();
        System.out.println("Another Uncompressed Size: " + anotherUncompressedSize);
        
        if (anotherUncompressedSize > 1500) {
            System.out.println("The total size is quite large!");
        }
        
        /* read */ long uncompressedSize = gzipParameters.getUncompressedSize();
        System.out.println("Original Uncompressed Size: " + uncompressedSize);
        
        ArrayList<Long> sizesComparisonList = new ArrayList<>();
        sizesComparisonList.add(uncompressedSize);
        sizesComparisonList.add(anotherUncompressedSize);
        
        for (long size : sizesComparisonList) {
            System.out.println("Size: " + size);
        }
    }
}