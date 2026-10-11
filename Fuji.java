public class Fuji extends Apple {
    private boolean crisp;

    // Makes a default Fuji apple.
    public Fuji() {
        super("Fuji", 1.0);
        crisp = true;
    }

    public Fuji(double weight) {
        super("Fuji", weight);
        crisp = true;
    }

    public Fuji(double weight, boolean crisp) {
        super("Fuji", weight);
        this.crisp = crisp;
    }

    public boolean getCrisp() {
        return crisp;
    }

    public void setCrisp(boolean crisp) {
        this.crisp = crisp;
    }

    public String toString() {
        return super.toString() + "\nCrisp: " + crisp;
    }
}
