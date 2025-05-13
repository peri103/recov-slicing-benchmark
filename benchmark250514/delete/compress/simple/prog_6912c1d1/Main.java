import org.apache.commons.compress.archivers.tar.TarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        TarArchiveEntry entry = new TarArchiveEntry("example.txt");
        long modTime = System.currentTimeMillis();
        /* write */ entry.setModTime(modTime);
        /* read */ long readModTime = entry.getModTime();
        System.out.println("Modification Time: " + readModTime);
    }
}