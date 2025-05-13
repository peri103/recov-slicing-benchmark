import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        /* write */ entry.setSize(1024);
        /* read */ long size = entry.getSize();
        System.out.println(size);
    }
}