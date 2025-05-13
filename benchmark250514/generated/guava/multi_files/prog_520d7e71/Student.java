public class Student {
    private String name;
    private RangeMapHandler rangeMapHandler = new RangeMapHandler();

    public Student(String name) {
        this.name = name;
    }

    public void addRangeToHandler(int start, int end, String value) {
        rangeMapHandler.addRange(start, end, value);
    }

    public String getValueFromHandler(int key) {
        return rangeMapHandler.getValue(key);
    }

    public String getName() {
        return name;
    }
}