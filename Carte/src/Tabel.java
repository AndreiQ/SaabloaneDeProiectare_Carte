
public class Tabel implements ISubcapitolElement{

	private String nume;

	@Override
	public String toString() {
		return "Tabel [nume=" + nume + "]";
	}

	public Tabel(String nume) {
		this.nume = nume;
	}
}
