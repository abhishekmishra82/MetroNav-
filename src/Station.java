public class Station {
    public String name;
    public String line;

    public Station(String name, String line) {
        this.name = name;
        this.line = line;
    }

    @Override
    public String toString() {
        return name + " (" + line + " Line)";
    }
}
