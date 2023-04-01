import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String palavra = input.next();
		String invert = "";
		for(int i = palavra.length() - 1 ; i >= 0;i--) {
			invert += palavra.charAt(i);
			
		}
		input.close();
		System.out.print(invert);
	}

}

