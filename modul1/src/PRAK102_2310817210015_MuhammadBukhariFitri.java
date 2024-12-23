import java.util.Scanner;

public class PRAK102_2310817210015_MuhammadBukhariFitri {

	public static void main(String[] args) {
		int counter = 1, angka;
		Scanner input = new Scanner(System.in);
		angka = input.nextInt();
		
		input.close();
		
		while(counter <= 11) {
			if(angka % 5 == 0) {
				System.out.print(angka / 5 - 1 + ", ");
			}
			else if(counter == 11) {
				System.out.print(angka);
			}
			else {
				System.out.print(angka + ", ");
			}
			angka++;
			counter++;
		}
			
	}

}
