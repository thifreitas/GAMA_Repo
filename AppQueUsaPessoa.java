import java.util.Scanner;

public class AppQueUsaPessoa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String txtNome, txtMail;
		float txtSalario;
		
		txtNome = input.nextLine();
		txtMail = input.nextLine();
		txtSalario = input.nextFloat();
		
		Pessoas p = new Pessoas("Thiago", "thiago@freitas.com", 1000);
		
		
		
		
		System.out.println(p.getNome());
		System.out.println(p.getEmail());
		System.out.println(p.getSalario());
		
	}

}
