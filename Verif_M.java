import java.util.Scanner;

public class Verif_M {
	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		
		int continuar;
		do {
			int a = myScan.nextInt();
		    int b = myScan.nextInt();
		
		    if ((a % b) == 0) {
			    System.out.println("O primeiro valor é múltiplo do segundo valor.");
		    } else {
			    System.out.println("O primeiro valor não é múltiplo do segundo valor.");
		    }
			System.out.println("Deseja continuar? (SIM = DIGITE '1')");
			continuar = myScan.nextInt(); 
			
		} while (continuar == 1);
		
		System.out.println("Fim do programa.");
		
	}
}