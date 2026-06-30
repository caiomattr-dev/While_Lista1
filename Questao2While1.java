package whileLista1.java;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao2While1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.0000");
		
		int far = 50;
		double cels = 0;
		
		while(far <= 150) {
			cels = (5.0 / 9.0) * (far - 32);
			System.out.println(far + " = " + df.format(cels));
			far++;
			
		}

	}

}
