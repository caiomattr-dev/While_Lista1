package whileLista1.java;
import java.util.Scanner;

public class Questao8While1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira numero para serie: ");
		int num = s.nextInt();
		int atual = 0;
		int tAnt = 1;
		int tAAnt = 1;
		System.out.println("1 1");
		
		while(atual < num) {
			atual = tAnt + tAAnt;
			System.out.println(" " + atual);
			tAAnt = tAnt;
			tAnt = atual;
		}
		System.out.println("");
		System.out.println("Fim ");

	}

}
