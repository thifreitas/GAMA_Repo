import java.util.Scanner;
public class BombaTeste {
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	
	double txtInA;
	double txtInB;
	int txttipo;
	
	System.out.println("Litros:");
	txtInA = input.nextInt();
	System.out.println("--------------");
	System.out.println("Valor:");
	txtInB = input.nextDouble();
	System.out.println("--------------");
	System.out.println("Tipo(Alcool(1)/Gasolina(2)/Diesel(3):");
	txttipo = input.nextInt();
	System.out.println("--------------");
			
	BombaCombustivel p = new BombaCombustivel(txtInA,txtInB,txttipo);
	
	p.tipoComb(txttipo);
	p.calculaTotal(txtInA, txtInB);
	
	System.out.println("Total: "+p.getTotal());
	System.out.println("Litros: "+p.getLitros());
	System.out.println("Tipo: "+p.getTipo()+"-"+p.getNome());
	System.out.println("Valor do Litro: "+p.getValor());
	
	input.close();
	}
}
