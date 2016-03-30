package additional;

//Static field
public class PostMan {

	private static PostMan postMan = new PostMan();

	private PostMan() {
	}

	public static PostMan getInstance() {
		return postMan;
	}

}
