public class RoadBike extends Cycle {

    public RoadBike() {
        super(CycleType.ROAD);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("This is a road bike. This has thin tyres");
    }
}
