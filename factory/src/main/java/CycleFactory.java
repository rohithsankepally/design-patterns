public class CycleFactory {

    /**
     * Given the cycle type it return the appropriate object
     * This helps us abstract out the object creation logic.
     *
     * @param cycleType
     * @throws Exception
     */
    public static Cycle getCycle(CycleType cycleType) throws Exception {
        switch (cycleType) {
            case ROAD:
                return new RoadBike();
            case HYBRID:
                return new HybridBike();
            case MTB:
                return new MountainBike();
            default:
                throw new Exception("Invalid cycle type : " + cycleType.name());
        }
    }

}
