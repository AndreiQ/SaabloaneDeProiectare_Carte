import java.util.List;

public class Capitol {

	private String nume;
	private List<Subcapitol> subcapitole;

	public Capitol(String nume, List<Subcapitol> subcapitole) {
		this.nume = nume;
		this.subcapitole = subcapitole;
	}

	@Override
	public String toString() {
		return "Capitol [nume=" + nume + ", subcapitole=" + subcapitole + "]";
	}
	
}
