package soal2;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.HashMap;

class Negara {
	private String nama, jenisKepemimpinan, namaPemimpin;
	private int tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan;
	
	public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }
	
	public Negara(String nama, String jenisKepemimpinan, String namaPemimpin) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
    }
	
	public String getNama() {
        return nama;
    }

    public String getJenisKepemimpinan() {
        return jenisKepemimpinan;
    }

    public String getNamaPemimpin() {
        return namaPemimpin;
    }

    public int getTanggalKemerdekaan() {
        return tanggalKemerdekaan;
    }

    public int getBulanKemerdekaan() {
        return bulanKemerdekaan;
    }

    public int getTahunKemerdekaan() {
        return tahunKemerdekaan;
    }
    
    public void tampilkanDetail(HashMap<Integer, String> daftarBulan) {
        System.out.print("Negara " + getNama() + " mempunyai " + getJenisKepemimpinan() + " bernama " + getNamaPemimpin());
        if (!getJenisKepemimpinan().equals("monarki")) {
            System.out.println("\nDeklarasi Kemerdekaan pada Tanggal " + getTanggalKemerdekaan() + " " +
                    daftarBulan.get(getBulanKemerdekaan()) + " " + getTahunKemerdekaan() + "\n");
        }
        else {
            System.out.println("\n");
        }
    }
}

public class programNegara {
	public static void main(String[] args) {
		LinkedList<Negara> negaraList = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		int jumlahNegara = scanner.nextInt();	
		scanner.nextLine();
		 	HashMap<Integer, String> daftarBulan = new HashMap<>();
	        daftarBulan.put(1, "Januari");
	        daftarBulan.put(2, "Februari");
	        daftarBulan.put(3, "Maret");
	        daftarBulan.put(4, "April");
	        daftarBulan.put(5, "Mei");
	        daftarBulan.put(6, "Juni");
	        daftarBulan.put(7, "Juli");
	        daftarBulan.put(8, "Agustus");
	        daftarBulan.put(9, "September");
	        daftarBulan.put(10, "Oktober");
	        daftarBulan.put(11, "November");
	        daftarBulan.put(12, "Desember");
		
		for(int i=0; i < jumlahNegara; i++) {
			String namaNegara = scanner.nextLine();
            String jenisKepemimpinan = scanner.nextLine();
            String namaPemimpin = scanner.nextLine();
            
            if (jenisKepemimpinan.equals("monarki")) {
                negaraList.add(new Negara(namaNegara, jenisKepemimpinan, namaPemimpin));
            } 
            
            else {
                int tanggalKemerdekaan = scanner.nextInt();
                int bulanKemerdekaan = scanner.nextInt();
                int tahunKemerdekaan = scanner.nextInt();
                scanner.nextLine();
                negaraList.add(new Negara(namaNegara, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan));
            }
        }
        
        for (Negara negara : negaraList) {
            negara.tampilkanDetail(daftarBulan);
        }
        
        scanner.close();
	}

}
