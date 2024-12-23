package PRAK202_2310817210015_MuhammadBukhariFitri;

class Kopi {
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

public class Soal2Main {
		public static void main(String[] args) {
			Kopi kopi1 = new Kopi();
			kopi1.namaKopi = "Espresso";
			kopi1.ukuran = "Medium";
			kopi1.harga = 25000;
			kopi1.info();
			kopi1.setPembeli("Alice");
			System.out.println("Pembeli Kopi: " + kopi1.getPembeli());
			System.out.println("Pajak Kopi: Rp. " + kopi1.getPajak());
	}

}
