public class BillPughSingleton {
    private BillPughSingleton() {
    }

    /**
     * The idea of using a inner static class is the JVM does a lazy initialization
     * of inner classes. This doesn't require synchronization
     */
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
