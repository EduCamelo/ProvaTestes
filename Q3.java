import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] faturamento = new double[29];
		double maior = faturamento[0];
		double menor = faturamento[0];
		double media = 0;
		double mes = 0;
		int cont = 0;
		for(int i = 0; i < faturamento.length ; i++) {
			mes =+ faturamento[i];
			if(maior < faturamento[i]) {
				maior = faturamento[i];
			}
			if(menor > faturamento[i]) {
				menor = faturamento[i];
			}	
		}
		media = mes /30;
		for(int i = 0; i<faturamento.length; i++ ) {
			if( media < faturamento[i]) {
				cont++;
			}
		}
		input.close();
		System.out.println("O maior valor de faturamento foi: R$"+maior );
		System.out.println("O menor valor de faturamento foi: R$"+menor );
		System.out.println("O número de dia(s) que o valor foi maior que a média foi: "+cont );
		
	}

}
