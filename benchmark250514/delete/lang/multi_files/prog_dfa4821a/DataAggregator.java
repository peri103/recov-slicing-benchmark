public class DataAggregator {
    private String[] data;

    public DataAggregator(String[] data) {
        this.data = data;
    }

    public String aggregateData() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String item : data) {
            stringBuilder.append(item).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
