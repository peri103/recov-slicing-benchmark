import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry entry = new JarArchiveEntry("example.jar");
        byte[] extraData = {1, 2, 3, 4};

        /* write */ entry.setExtra(extraData);
        /* read */ byte[] readExtraData = entry.getExtra();

        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
    }
}