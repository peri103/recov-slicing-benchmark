public class Student {
    private String name;
    private StrBuilder notes = new StrBuilder();

    public Student(String name) {
        this.name = name;
    }

    public void addNoteChar(char note) {
        /* write */ notes.append(note);
    }

    public String getNotes() {
        /* read */ return notes.toString();
    }

    public String getName() {
        return name;
    }
}