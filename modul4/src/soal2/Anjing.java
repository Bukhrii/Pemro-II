package soal2;

public class Anjing extends HewanPeliharaan {
	String warnaBulu;
	String[] kemampuan;
	
	public Anjing(String r, String n, String w, String[] k) {
		super(r, n);
		this.warnaBulu = w;
		this.kemampuan = k;
	}
	
	void displayDetailAnjing () {
		display();
		System.out.println("Memiliki warna bulu : " + this.warnaBulu);
		System.out.print("Memiliki kemampuan : ");
		for(String nilai : kemampuan) {
			System.out.print(nilai + "  ");
		}
	}
}
