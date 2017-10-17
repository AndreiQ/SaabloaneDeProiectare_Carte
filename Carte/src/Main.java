import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Subcapitol> subcapitole = new ArrayList<Subcapitol>();
		List<ISubcapitolElement> elemente = new ArrayList<ISubcapitolElement>();// = new List<SubcapitolElement>();
		elemente.add(new Imagine("xxx"));
		elemente.add(new Tabel("xxx"));
		elemente.add(new Paragraf("xxx"));
		
		subcapitole.add(new Subcapitol("NumeSubcapitol",elemente));
		
		List<Capitol> capitole = new ArrayList<Capitol>();
		capitole.add(new Capitol("capitol", subcapitole));
		
		List<Autor> autori = new ArrayList<Autor>();
		autori.add(new Autor("autor1"));
		
		
		
		
		Carte carte = new Carte("Carte",new Cuprins("cuprins"),autori,capitole);
		System.out.println(carte);
	}
}
