public class Name {
    private String name;

    public Name(String value) {
        this.name = value;
    }

    public String changeName(String value) {
        this.name = value;
        return this.name;
    }

    public String getValue() {
        return this.name;
    }
}