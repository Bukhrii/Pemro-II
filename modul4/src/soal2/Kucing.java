package soal2;

public class Kucing extends HewanPeliharaan {
	String warnaBulu;
	
	public Kucing(String r, String n, String w) {
		super(r, n);
		this.warnaBulu = w;
	}
	
	void displayDetailKucing() {
		display();
		System.out.println("Memiliki warna bulu : " + this.warnaBulu);
	}
}
