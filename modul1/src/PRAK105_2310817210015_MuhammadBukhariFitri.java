import java.text.DecimalFormat;
import java.util.Scanner;

public class PRAK105_2310817210015_MuhammadBukhariFitri {
	public static void main(String[] args) {
	final double phi = 3.14;
	double jariJari, tinggi;
	
	Scanner input = new Scanner(System.in);
	System.out.print("Masukkan jari-jari: ");
	jariJari = input.nextDouble();
	System.out.print("Masukkan tinggi: ");
	tinggi = input.nextDouble();
	input.close();
	
	DecimalFormat df = new DecimalFormat("#.###");
	
	double volume = phi * jariJari * jariJari * tinggi;
	System.out.print("Volume tabung dengan jari-jari " + jariJari + " cm dan tinggi " + tinggi + " cm adalah " + df.format(volume) + " m3");
	}
}
