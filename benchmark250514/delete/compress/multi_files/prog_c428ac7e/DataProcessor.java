import java.util.ArrayList;

public class DataProcessor {
    private ArrayList<Long> sizes = new ArrayList<>();

    public void addSize(long size) {
        sizes.add(size);
    }

    public long calculateSum() {
        long sum = 0;
        for (Long size : sizes) {
            sum += size;
        }
        return sum;
    }

    public long calculateAverage() {
        long sum = calculateSum();
        return sum / sizes.size();
    }

    public long findMaxSize() {
        long maxSize = 0;
        for (Long size : sizes) {
            if (size > maxSize) {
                maxSize = size;
            }
        }
        return maxSize;
    }

    public long findMinSize() {
        long minSize = sizes.get(0);
        for (Long size : sizes) {
            if (size < minSize) {
                minSize = size;
            }
        }
        return minSize;
    }

    public void addCompressedSize(long compressedSize) {
        sizes.add(compressedSize);
    }
}