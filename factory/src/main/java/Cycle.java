public abstract class Cycle {

    private CycleType type;

    public Cycle(CycleType type) {
        this.type = type;
    }

    protected abstract void construct();

    public CycleType getType() {
        return type;
    }

    public void setType(CycleType type) {
        this.type = type;
    }
}
