package additional;

//Accessor
public class Sender {

	private static Sender instance;

    private Sender() {
    }

	public static synchronized Sender getInstance() {
		if (instance == null) {
			instance = new Sender();
		}
		return instance;
	}

}
