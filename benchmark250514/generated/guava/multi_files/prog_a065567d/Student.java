public class Student {
    private String name;
    private RangeMapHandler rangeMapHandler;

    public Student(String name) {
        this.name = name;
        this.rangeMapHandler = new RangeMapHandler();
    }

    public void addRange(int start, int end, String value) {
        rangeMapHandler.addRange(start, end, value);
    }

    public String getValueFromRange(int key) {
        return rangeMapHandler.getValue(key);
    }
}
