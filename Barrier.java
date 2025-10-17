public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    @Override
    public void destroyed() {
        strength -= 9;
    }

    public String getBarrierInfo() {
        return "Barrier Strength: " + strength;
    }

    public boolean isDestroyed() {
        return strength <= 0;
    }
}
