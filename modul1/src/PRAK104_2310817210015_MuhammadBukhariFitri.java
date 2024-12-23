import java.util.Scanner;

public class PRAK104_2310817210015_MuhammadBukhariFitri {

	public static void main(String[] args) {
		String abu, bagas;
		int skorAbu = 0, skorBagas =0;
		Scanner input = new Scanner(System.in);
		System.out.print("Tangan Abu: ");
		abu = input.nextLine();
		System.out.print("Tangan Bagas: ");
		bagas = input.nextLine();
		
		for(int ronde = 0; ronde < 6; ronde += 2) {
			if (abu.charAt(ronde) == bagas.charAt(ronde)) {
                continue;
            }
			else if(abu.charAt(ronde) == 'G' && bagas.charAt(ronde) == 'K' || abu.charAt(ronde) == 'K' && bagas.charAt(ronde) == 'B' || abu.charAt(ronde) == 'B' && bagas.charAt(ronde) == 'G') {
				skorAbu += 1;
			}
			else {
				skorBagas += 1;
			}
		}
		if(skorBagas == skorAbu) {
			System.out.print("Seri");
		}
		else if(skorBagas > skorAbu) {
			System.out.print("Bagas");
		}
		else {
			System.out.print("Abu");
		}
		
		input.close();
	}
}