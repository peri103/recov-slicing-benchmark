public class Main {
    public static void main(String[] args) {
        ArchiveManager archiveManager = new ArchiveManager();
        archiveManager.addEntry("example.txt", 755);
        archiveManager.addEntry("anotherFile.txt", 644);

        ArchiveViewer archiveViewer = new ArchiveViewer(archiveManager);
        int unixMode = archiveViewer.displayUnixMode("example.txt");
        System.out.println("Unix Mode for example.txt: " + unixMode);
    }
}