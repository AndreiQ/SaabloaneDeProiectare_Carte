import java.util.ArrayList;

public class ImageProxy implements Element{


	private String nume;
	private Imagine img;
	
	public ImageProxy(String nume) {
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
	public String toString() {
		return "Imagine [nume=" + nume + "]";
	}
	@Override
	public void print() {
		if(img == null){
			img = new Imagine(nume);
			}
	      img.print();
	}

}
