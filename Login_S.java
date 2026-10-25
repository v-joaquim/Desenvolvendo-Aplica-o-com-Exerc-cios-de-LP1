import java.util.Scanner;

public class Login_S {
    public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		
		final String senha_correta = "1234";
		String senha_tent = myScan.next();
		
		if (senha_correta.equals(senha_tent)) {
			System.out.println("Acesso permitido.");
		} else {
			System.out.println("Acesso negado.");
		}
		
		System.out.println("Fim do programa.");
	}
}