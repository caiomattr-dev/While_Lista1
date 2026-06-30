package whileLista1.java;
import java.util.*;

public class Questao1While1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int continuar = 1;
		int div;
		String binario = "";
		int resto;
		
		while(continuar == 1) {
			System.out.println("Digite um número de base 10: ");
			int num = s.nextInt();
			
			if(num == 0) {
				System.out.println("Número binário = 0");
			}
			else
				if(num % 10 ==0) {
				while(num >= 1) {
					resto = num % 2;
					binario = resto + binario;
					num = num / 2;
				}
			}
				else {
					System.out.println("O número inserido não é uma base de 10. ");
				}
			System.out.println("Número em binário: " + binario);
			System.out.println("Deseja continuar? [1] Sim , [2] Não");
			continuar = s.nextInt();
		}
		System.out.println("Fim do programa. ");

	}

}
