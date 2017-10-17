import java.util.List;

public class Subcapitol {

	private String nume;
	private List<ISubcapitolElement> elemente;
	
	public Subcapitol(String nume,List<ISubcapitolElement> elemente ) {
		this.nume = nume;
		this.elemente = elemente;
	}

	@Override
	public String toString() {
		return "Subcapitol [nume=" + nume + ", elemente=" + elemente + "]";
	}
	
	
}
