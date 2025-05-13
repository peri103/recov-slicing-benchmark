import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry tarEntry = new TarArchiveEntry("example.txt");
        /* write */ tarEntry.setSize(1024);
        /* read */ long size = tarEntry.getSize();
        System.out.println("Size: " + size);
    }
}