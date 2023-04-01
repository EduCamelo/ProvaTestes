public class Q4 {

	public static void main(String[] args) {
	double sp = 67836.43;
	double rj = 36678.66;
	double mg = 29229.88;
	double es = 27165.48;
	double outros = 19849.53;
	
	double total = sp + rj + mg + es + outros;
	System.out.println("O percentual de  representção de SP foi: " + ((sp / total)*100));
	System.out.println("O percentual de  representção do RJ foi: " + ((rj / total)*100));
	System.out.println("O percentual de  representção de MG foi: " + ((mg / total)*100));
	System.out.println("O percentual de  representção do ES foi: " + ((es / total)*100));
	System.out.println("O percentual de  representção de outros estados foi: " + ((outros / total)*100));
	
	}

}
