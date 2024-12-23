package soal1;

public class HewanPeliharaan {
	String nama, ras;
	
	public HewanPeliharaan(String r, String n) {
		this.nama = n;
		this.ras = r;
	}
	
	void display() {
		System.out.println("Detail Hewan Peliharaan:");
		System.out.println("Nama hewan peliharaanku adalah : " + this.nama);
		System.out.println("Dengan ras : " + this.ras);
	}

}
