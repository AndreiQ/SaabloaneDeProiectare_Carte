import java.util.List;

public class Carte {

	private String titlu;
	private Cuprins cuprins;
	private List<Autor> autori;
	private List<Capitol> capitole;
	
	
	public Carte(String titlu,Cuprins cuprins, List<Autor> autori, List<Capitol> capitole) {
		this.titlu = titlu;
		this.cuprins = cuprins;
		this.autori = autori;
		this.capitole = capitole;
	}


	@Override
	public String toString() {
		return "Carte [titlu=" + titlu + ", cuprins=" + cuprins + ", autori=" + autori + ", capitole=" + capitole + "]";
	}
}
