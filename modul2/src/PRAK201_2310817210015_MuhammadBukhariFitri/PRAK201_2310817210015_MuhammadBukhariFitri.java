package PRAK201_2310817210015_MuhammadBukhariFitri;

class Buah {
    String namaBuah;
    double berat;
    double harga;  
    double jumlahBeli; 

    double hitungSebelumDiskon() {
		return jumlahBeli / berat * harga;
	}
	double diskon() {
		return 1 - Math.floor(jumlahBeli / 4) * 0.02;
	}
	double hitungSesudahDiskon() {
		return hitungSebelumDiskon() * diskon();
	}
	double hitungHargaTotalDiskon() {
		return hitungSebelumDiskon() - hitungSesudahDiskon();
	}


    void menampilkanInfo() {
        System.out.println("Nama Buah: " + namaBuah);
        System.out.println("Harga per unit: Rp" + harga);
        System.out.println("Jumlah Beli: " + jumlahBeli + " kg");
        System.out.println("Harga Sebelum Diskon: Rp" + hitungSebelumDiskon());
        System.out.println("Total Diskon: Rp" + hitungHargaTotalDiskon());
        System.out.println("Harga Setelah Diskon: Rp" + hitungSesudahDiskon());
        System.out.println();
    }
}

public class PRAK201_2310817210015_MuhammadBukhariFitri {

    public static void main(String[] args) {
        Buah apel = new Buah();
        apel.namaBuah = "Apel";
        apel.berat = 0.4;
        apel.harga = 7000.0;
        apel.jumlahBeli = 40.0;
        apel.menampilkanInfo();

        Buah mangga = new Buah();
        mangga.namaBuah = "Mangga";
        mangga.berat = 0.2;
        mangga.harga = 3500.0;
        mangga.jumlahBeli = 15.0;
        mangga.menampilkanInfo();

        Buah alpukat = new Buah();
        alpukat.namaBuah = "Alpukat";
        alpukat.berat = 0.25;
        alpukat.harga = 10000.0;
        alpukat.jumlahBeli = 12.0;
        alpukat.menampilkanInfo();
    }
}
