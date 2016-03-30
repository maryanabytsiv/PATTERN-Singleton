package additional;

public class Holder {

    public static class SingletonHolder {
        public static final Holder HOLDER_INSTANCE = new Holder();
    }

    private Holder() {
    }
    public static Holder getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
