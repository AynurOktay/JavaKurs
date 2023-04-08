package _Gun_28_classes.Kitapci;

public class Constructor {
    String name;
    int publishYear;
    String author;

    public Constructor() {
    }

    public Constructor(int publishYear) {
        this.publishYear = publishYear;
    }

    public Constructor(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Constructor{" +
                "name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", author='" + author + '\'' +
                '}';
    }
}
