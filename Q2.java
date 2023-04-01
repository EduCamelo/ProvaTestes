import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x = 0;
		double y = 1;
		double z = 0;
		int i = 0;
		while (i <= 0) {
			System.out.print("Digite um valor para ser calculado na sequencia de febonacci: ");
			z = input.nextDouble();
			if (z == x + y) {
				System.out.println("O número " + z + "mfaz parte da sequência de fibonacci");
				i++;
			}
			else {System.out.println("Esse número não faz parte da próximo item da sequência");
				}

		}
		input.close();
	}

}