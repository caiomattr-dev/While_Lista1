package whileLista1.java;
import java.util.Scanner;

public class Questao6While1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int raiz = 0; // quantas subtrações foram feita = raiz exata / aproximada
		System.out.println("Escolha um número: ");
		int num = s.nextInt();
		int imp = 1;
		int aux = num;
		
		while(num > 0) {
			
			num = num - imp;
			imp += 2;
			raiz++;
		}
		System.out.println("A raiz de: " + aux + " é= " + raiz);

	}

}
