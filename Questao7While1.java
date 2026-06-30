package whileLista1.java;
import java.util.Scanner;

public class Questao7While1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Voce deseja iniciar? [s] ou [n] ");
		String cont = s.next();
		int resto = 0;
		int primer = 0;
		int raiz = 0;
		int raizI = 0;
		
		while(cont.equalsIgnoreCase("s")) {
			System.out.println("Digite um número de 4 digitos: ");
			int num = s.nextInt();
			
			if(num < 1000 || num > 9999) {
				System.out.println("Numero incorreto ");
				break;
			}
			primer = num / 100;
			resto = num % 100;
			raiz = primer + resto;
			raizI = Math.powExact(raiz, 2);
			if(raizI == num) {
				System.out.println("Numero inicial: " + num + ", caracteristica: " + primer + "+" + resto + " raiz do inicial: " + raiz + " ou seja: " + raizI);
			}
			else
				System.out.println("Número comum. ");
			
			System.out.println("Deseja inserir outro número? [s] ou [n] ");
			cont = s.next();
		}
		System.out.println("Fim. ");
	}

}
