public class GoldenDelicious extends Apple {
    private boolean goldenSkin;

    // Makes a default Golden Delicious apple.
    public GoldenDelicious() {
        super("Golden Delicious", 1.0);
        goldenSkin = true;
    }

    public GoldenDelicious(double weight) {
        super("Golden Delicious", weight);
        goldenSkin = true;
    }

    public GoldenDelicious(double weight, boolean goldenSkin) {
        super("Golden Delicious", weight);
        this.goldenSkin = goldenSkin;
    }

    public boolean getGoldenSkin() {
        return goldenSkin;
    }

    public void setGoldenSkin(boolean goldenSkin) {
        this.goldenSkin = goldenSkin;
    }

    public String toString() {
        return super.toString() + "\nGolden skin: " + goldenSkin;
    }
}
