package PRAK202_2310817210015_MuhammadBukhariFitri;

public class Kopi {
	String namaKopi, ukuran, nama;
	double harga;
	final double pajak = 0.11;
	
	void info() {
		 System.out.println("Nama Kopi: " + namaKopi);
		 System.out.println("Ukuran: " + ukuran);
		 System.out.println("Harga: " + harga);
	}
	
	void setPembeli(String nama) {
		this.nama = nama;
	}
	
	String getPembeli() {
		return nama;
	}
	
	double getPajak() {
		return pajak * harga;
	}

}
