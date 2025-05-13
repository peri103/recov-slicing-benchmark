public class Student {
    private String name;
    private int age;
    private StrBuilderWrapper strBuilderWrapper = new StrBuilderWrapper();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addDescription(String separator, String description) {
        strBuilderWrapper.appendWithSeparator(separator, description);
    }

    public String getDescription() {
        return strBuilderWrapper.getString();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
