import java.util.Scanner;

public class TimeTeste {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int txth,txtm,txts;
		System.out.println("Hora:");
		txth = input.nextInt();
		System.out.println("Min:");
		txtm = input.nextInt();
		System.out.println("Seg:");
		txts = input.nextInt();
		
		Time p = new Time(txth,txtm,txts);
		
		System.out.println("Universal: "+p.exibirHoraUniversal());
		p.setTime(p.getHora(), p.getMin(), p.getSeg());
		System.out.println("Padrão: "+p.exibirHoraPadrao());
		input.close();
	}
}
