import java.util.ArrayList;
import java.util.List;

public class Carte {

	private String titlu;
	private Cuprins cuprins;
	private List<Autor> autori;
	private ArrayList<Element> continut = new ArrayList<Element>();
	
	public Carte(String titlu, Cuprins cuprins, List<Autor> autori) {
		this.titlu = titlu;
		this.autori = autori;
		this.cuprins = cuprins;
	}
	public void addElement(Element e){
		if(e != null){
			continut.add(e);
		}
	}
	public void print(){
		for(Element e : continut){
			e.print();
		}
	}
}
