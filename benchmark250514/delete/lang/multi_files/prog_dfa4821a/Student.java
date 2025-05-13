public class Student {
    private String name;
    private int age;
    private StrBuilderWrapper strBuilderWrapper = new StrBuilderWrapper();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addDetail(String detail) {
        strBuilderWrapper.appendText(detail);
    }

    public void finalizeDetails() {
        strBuilderWrapper.appendSeparator();
    }

    public String getDetails() {
        return strBuilderWrapper.getString();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
