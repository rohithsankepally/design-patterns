public class HybridBike extends Cycle {

    public HybridBike() {
        super(CycleType.HYBRID);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("This is a hybrid bike. This has medium tyres & works for any terrain");
    }
}
