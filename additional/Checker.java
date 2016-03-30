package additional;

//Double Checked Locking & volatile
public class Checker {
    private static volatile Checker instance;

    private Checker() {
    }
    public static Checker getInstance() {
        Checker localInstance = instance;
        if (localInstance == null) {
            synchronized (Checker.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Checker();
                }
            }
        }
        return localInstance;
    }
}