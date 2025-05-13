import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        /* write */ entry.setCompressedSize(1024L);
        /* read */ long compressedSize = entry.getCompressedSize();
        System.out.println(compressedSize);
    }
}