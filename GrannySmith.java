public class GrannySmith extends Apple {
    private boolean tart;

    // Makes a default Granny Smith apple.
    public GrannySmith() {
        super("Granny Smith", 1.0);
        tart = true;
    }

    public GrannySmith(double weight) {
        super("Granny Smith", weight);
        tart = true;
    }

    public GrannySmith(double weight, boolean tart) {
        super("Granny Smith", weight);
        this.tart = tart;
    }

    public boolean getTart() {
        return tart;
    }

    public void setTart(boolean tart) {
        this.tart = tart;
    }

    public String toString() {
        return super.toString() + "\nExtra tart: " + tart;
    }
}
