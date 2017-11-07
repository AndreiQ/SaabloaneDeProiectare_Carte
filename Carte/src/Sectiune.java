import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Element{
	
	private String titlu;
	ArrayList<Element> continut = new ArrayList<Element>();
	
	public Sectiune(String t){
		this.titlu = t;
	}

	@Override
	public void add(Element e) {
		if(e != null){
			continut.add(e);
		}
	}
	@Override
	public void remove(Element e) {

		if(e != null){
			continut.remove(e);
		}
	
	}
	@Override
	public Element getElement(int index) {
		return continut.get(index);
	}
	@Override
	public ArrayList<Element> getElements() {
		return continut;
	}

	@Override
	public void print() {
		for(Element e : continut){
			e.print();
		}
	}
}
