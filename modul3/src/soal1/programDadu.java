package soal1;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;


class Dadu {
	private int nilai;
	
	public void acakNilai() {
		Random rand = new Random();
		this.nilai = rand.nextInt(6) + 1;
	}
	
	public int getNilai() {
		return this.nilai;
	}
}

public class programDadu {
	public static void main(String[] args) {
		LinkedList<Dadu> daftarDadu = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		int jumlahDadu = scanner.nextInt();
		int totalNilai = 0;
		
		for(int i = 0; i < jumlahDadu; i++) {
			Dadu dadu = new Dadu();
            dadu.acakNilai();
            daftarDadu.add(dadu);

            int nilai = dadu.getNilai();
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + nilai);
            totalNilai += nilai;
		}
		
		System.out.println("Total nilai dadu keseluruhan: " + totalNilai);

        scanner.close();
	}

}
