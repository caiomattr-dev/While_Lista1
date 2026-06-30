package whileLista1.java;
import java.util.Scanner;

public class Questao13While1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double paisA = 5000000;
		double paisB = 7000000;
		int anos = 0;
		
		while(paisA < paisB) {
			paisA = paisA + (paisA * 0.03);
			paisB = paisB + (paisB * 0.02);
			anos++;
			
		}
		System.out.println("demoraram: " + anos + " anos para A passar B. ");
	}

}
