public class MountainBike extends Cycle {

    public MountainBike() {
        super(CycleType.MTB);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("This is a mountain bike. This has fat tyres & shock absorbers");
    }
}
