package whileLista1.java;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao4While1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.00");
		
		String maiorCod = "";
		System.out.println("Informe o código do curso: ");
		String codigo = s.next();
		
		double maiorC = 0;
		double mF = 0;
		double candi = 0;
		double porcF = 0;
		
		while(!codigo.equalsIgnoreCase("X")) {
			System.out.println("Informe o número de vagas totais: ");
			double vagas = s.nextInt();
			System.out.println("Informe o número de candida mascul: ");
			double masc = s.nextInt();
			System.out.println("Informe o número de candida femin: ");
			double fem = s.nextInt();
			
			mF = fem + masc;
			candi = mF / vagas;
			System.out.println("A relação candidato/vaga é de: " + df.format(candi));
			
			porcF = (fem / mF) * 100.0;
			System.out.println("A porc do sexo femin é de: " + df.format(porcF));
			
			if(candi > maiorC) {
				maiorC = candi;
				maiorCod = codigo;
				System.out.println("O código do maior curso é: " + maiorCod);
				System.out.println("A qntd de vagas é: " + maiorC);
			}
			System.out.println("Deseja inserir outro código? ['X'] Não ");
			codigo = s.next();
			
		}
		System.out.println("Fim do programa. ");
	}

}
