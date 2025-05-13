import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;

public class Main {
    public static void main(String[] args) {
        // Since BZip2CompressorInputStream does not actually have setBlockSize and getBlockSize methods,
        // we will simulate this behavior with a custom class to demonstrate the concept.
        
        // Custom class to simulate BZip2CompressorInputStream with block size functionality
        class CustomBZip2CompressorInputStream {
            private int blockSize;

            public void setBlockSize(int blockSize) {
                this.blockSize = blockSize;
            }

            public int getBlockSize() {
                return this.blockSize;
            }
        }

        CustomBZip2CompressorInputStream stream = new CustomBZip2CompressorInputStream();
        /* write */ stream.setBlockSize(900000);
        /* read */ int blockSize = stream.getBlockSize();
        System.out.println(blockSize);
    }
}