import java.util.Scanner;

public class PRAK103_2310817210015_MuhammadBukhariFitri {

	public static void main(String[] args) {
		int counter = 1, N, bilanganAwal;
		Scanner input = new Scanner(System.in);
		N = input.nextInt();
		bilanganAwal = input.nextInt();
		
		
		do {
			if(bilanganAwal % 2 != 0) {
				System.out.print(bilanganAwal);
				counter++;
				if(counter <= N) {
					System.out.print(", ");
				}
			}
			bilanganAwal++;
		} while (counter <= N);
		input.close();
	}
}
