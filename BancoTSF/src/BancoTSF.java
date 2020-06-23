
public class BancoTSF {

	public static void main(String[] args) {
		Conta c,c1;
		c = new Conta("Thiago Freitas","123.456.789-85",2548,1000);
		c1 = new ContaEspecial("Jao Freitas","123.456.789-85",2588,1000,500);
		
		/*if (c.debitar(300)){
			System.out.println("Debito efetuado!");
		}
		if (c1.debitar(1200)) {
			System.out.println("Debito efetuado!-limit;");
		}*/
		
		System.out.println("----------------");
		System.out.println(c);
		System.out.println("----------------");
		System.out.println(c1);
		System.out.println("----------------");
		
		
		c.creditar(150);
		c1.creditar(250);
		
		c.debitar(1100);
		c1.debitar(1100);
		
		System.out.println("----------------");
		System.out.println(c);
		System.out.println("----------------");
		System.out.println(c1);
		System.out.println("----------------");
	}

}
