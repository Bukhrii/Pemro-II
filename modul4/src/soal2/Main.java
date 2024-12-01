package soal2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Pilih jenis hewan yang ingin diinputkan:\n1 = Kucing\n2 = Anjing\nMasukkan pilihan: ");
		int pilihan = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Nama Hewan Peliharaan: ");
		String nama = scanner.nextLine();		
		System.out.print("Ras: ");
		String ras = scanner.nextLine();	
		if(pilihan == 1) {
			System.out.print("Warna Bulu: ");
			String warnaBulu = scanner.nextLine();
			
			Kucing kucing = new Kucing(ras, nama, warnaBulu);
			kucing.displayDetailKucing();
		} else {
			System.out.print("Warna Bulu: ");
			String warnaBulu = scanner.nextLine();
			System.out.print("Kemampuan : ");
			String kemampuanInput = scanner.nextLine();
			String[] kemampuan = kemampuanInput.split(", ");
			Anjing anjing = new Anjing(ras, nama, warnaBulu, kemampuan);
			anjing.displayDetailAnjing();
		}
	}

}
