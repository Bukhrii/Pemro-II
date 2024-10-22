import java.util.Scanner;

public class PRAK101_2310817210015_MuhammadBukhariFitri {
	public static void main(String[] args) {
		String nama, tempatLahir, tanggalLahir, bulanLahir, tahunLahir;
		int tinggiBadan;
		float beratBadan;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Nama Lengkap: ");
		nama = input.nextLine();
		
		System.out.print("Masukkan Tempat Lahir: ");
		tempatLahir = input.nextLine();
		
		System.out.print("Masukkan Tanggal Lahir: ");
		tanggalLahir = input.nextLine();
		
		System.out.print("Masukkan Bulan Lahir: ");
		bulanLahir = input.nextLine();
		
		System.out.print("Masukkan Tahun Lahir: ");
		tahunLahir = input.nextLine();
		
		System.out.print("Masukkan Tinggi Badan: ");
		tinggiBadan = input.nextInt();
		
		System.out.print("Masukkan Berat Badan: ");
		beratBadan = input.nextFloat();
		
		input.close();
		
		switch (bulanLahir) {
		case "1" -> bulanLahir = "Januari";
		case "2" -> bulanLahir = "Februari";
		case "3" -> bulanLahir = "Maret";
		case "4" -> bulanLahir = "April";
		case "5" -> bulanLahir = "Mei";
		case "6" -> bulanLahir = "Juni";
		case "7" -> bulanLahir = "Juli";
		case "8" -> bulanLahir = "Agustus";
		case "9" -> bulanLahir = "September";
		case "10" -> bulanLahir = "Oktober";
		case "11" -> bulanLahir = "November";
		case "12" -> bulanLahir = "Desember";
		}
		System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + bulanLahir + " " + tahunLahir + " Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " Kilogram");
	}

}
