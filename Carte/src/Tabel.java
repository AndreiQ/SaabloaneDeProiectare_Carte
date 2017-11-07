import java.util.ArrayList;

public class Tabel implements Element{

	private String nume;

	@Override
	public String toString() {
		return "Tabel [nume=" + nume + "]";
	}

	public Tabel(String nume) {
		this.nume = nume;
	}

	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element getElement(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Element> getElements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void print() {

		System.out.println(nume);
	}
}
