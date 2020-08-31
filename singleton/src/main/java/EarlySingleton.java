/**
 * A very simple implementation of a Singleton Class
 * This is early initialization. Initialization occurs during class loading.
 * Drawback : Initialised irrespective of whether the class is used / not.
 */
public class EarlySingleton {

    private static EarlySingleton INSTANCE = new EarlySingleton();

    private EarlySingleton() {
    }

    public static EarlySingleton getInstance() {
        return INSTANCE;
    }
}
