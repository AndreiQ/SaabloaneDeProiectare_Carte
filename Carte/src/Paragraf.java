
public class Paragraf implements ISubcapitolElement{

	private String text;

	public Paragraf(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Paragraf [text=" + text + "]";
	}
}
