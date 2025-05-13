import org.apache.commons.compress.archivers.dump.DumpArchiveSummary;

public class ArchiveSummary {
    private DumpArchiveSummary summary = new DumpArchiveSummary();

    public void setSummaryDetails(long totalSize, int volumeId) {
        summary.setTotalSize(totalSize);
        summary.setVolumeId(volumeId);
    }

    public long getTotalSize() {
        return summary.getTotalSize();
    }

    public int getVolumeId() {
        return summary.getVolumeId();
    }
}
