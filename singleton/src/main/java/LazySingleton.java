/**
 * This is a very LAZY singleton class.
 * Initialized only when the instance is being used.
 */
public class LazySingleton {

    private static LazySingleton INSTANCE;

    private LazySingleton() {
    }

    /**
     * This is a dangerous way of creating/returning an instance.
     * When multiple threads call this method, there is a danger of returning multiple instances of this class
     */
    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

    /**
     * This is a safe one as multiple threads synchronously execute this.
     */
    synchronized public static LazySingleton getSafeInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

    /**
     * This is similar to the above method, but it synchronises only when instance is not initialized
     * This prevents locking every time the method is called.
     * Also referred to as double-checked locking
     */
    public static LazySingleton getDoubleSafeInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
