import java.util.ArrayList;

public interface Element {
	 void add(Element e);
	 void remove(Element e);
	 Element getElement(int index);
	 ArrayList<Element> getElements();
	 void print();
}
