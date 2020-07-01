package ui;
import java.util.ArrayList;
import java.util.Scanner;
import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionarios;
import model.Horista;

public class FolhaDePagamento {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Funcionarios> lista;
		lista = new ArrayList<Funcionarios>();
		
		int N, opcao;
		String nome;
		int nreg, nhoras;
		float valor1, valor2, valor3;

		System.out.println("Quantos funcionarios a cadastrar?");
		N = Integer.parseInt(teclado.nextLine());

		try {
			for (int i = 0; i < N; i++) {
				System.out.println("Digite 1- Chefe/ 2- Comissionado/ 3- Horista/ 4- Empreiteiro");
				opcao = Integer.parseInt(teclado.nextLine());
				switch (opcao) {
				case 1:
					System.out.println("Digite o numero de registro");
					nreg = Integer.parseInt(teclado.nextLine());
					System.out.println("Digite o nome");
					nome = teclado.nextLine();
					System.out.println("Digite o salario base, adicional e beneficio");
					valor1 = Float.parseFloat(teclado.nextLine());
					valor2 = Float.parseFloat(teclado.nextLine());
					valor3 = Float.parseFloat(teclado.nextLine());
					Funcionarios chefe = new Chefe(nreg, nome, valor1, valor2, valor3);
					lista.add(chefe);
					break;
				case 2:
					System.out.println("Digite o numero de registro");
					nreg = Integer.parseInt(teclado.nextLine());
					System.out.println("Digite o nome");
					nome = teclado.nextLine();
					System.out.println("Digite o salario base e comissao");
					valor1 = Float.parseFloat(teclado.nextLine());
					valor2 = Float.parseFloat(teclado.nextLine());
					Funcionarios comiss = new Comissionado(nreg, nome, valor1, valor2);
					lista.add(comiss);
					break;
				case 3:
					System.out.println("Digite o numero de registro");
					nreg = Integer.parseInt(teclado.nextLine());
					System.out.println("Digite o nome");
					nome = teclado.nextLine();
					System.out.println("Digite o numero de horas e o valor da hora");
					nhoras = Integer.parseInt(teclado.nextLine());
					valor1 = Float.parseFloat(teclado.nextLine());
					Funcionarios hr = new Horista(nreg, nome, valor1,nhoras);
					lista.add(hr);
					break;
				case 4:
					System.out.println("Digite o numero de registro");
					nreg = Integer.parseInt(teclado.nextLine());
					System.out.println("Digite o nome");
					nome = teclado.nextLine();
					System.out.println("Digite o valor da empreita");
					valor1 = Float.parseFloat(teclado.nextLine());
					Funcionarios empr = new Empreiteiro(nreg, nome, valor1);
					lista.add(empr);
					break;
				default:
					System.out.println("Opcao invalida");
					break;
				}
			}
			System.out.println("REG   NOME                  SALARIO R$ ");
			for (Funcionarios f : lista) {
				System.out.printf("%3d", f.getNumRegistro());
				System.out.printf("   %-23s", f.getNome());
				System.out.printf("%.2f\n", f.calcularSalario());
				System.out.println(f.getClass().getName());
			}
		} catch (Exception ex) {
			System.out.println("Erro ao cadastrar funcionarios");
			System.out.println("MOTIVO: "+ex.getMessage());

		}
	}
}
	
		
		/*try {
		
				ArrayList<Funcionarios> lista;
				
				lista = new ArrayList<Funcionarios>();
				
				lista.add(new Chefe(1,"Mario",5000, 10, 800));
				lista.add(new Comissionado(2,"Jao",3000, 15));
				lista.add(new Horista(3,"Tiao",50, 160));
				lista.add(new Empreiteiro(4,"Manuel",3500));
				lista.add(new Horista(5,"Segio",100, 160));
				lista.add(new Comissionado(6,"Breno",2000, 25));
				lista.add(new Horista(7,"Rafael",70, 160));
				lista.add(new Chefe(10,"Oiii",10500,10,150));
				
				//lista.remove(9);
				
				System.out.println("--- Lista de Funcionarios ---");
				for (Funcionarios q : lista) {
					System.out.printf("%3d", q.getNumRegistro());
					System.out.printf("%-23s", q.getNome());
					System.out.printf("%.2f\n", q.calcularSalario());
					//System.out.println(q.getNome()+" - "+q.getNumRegistro()+String.format(" - R$ %.2f", q.calcularSalario()));
					//System.out.println(q.getClass().getName());
				}
		
			}
			catch  (Exception e){
				System.out.println("Erro na execução!");
			}*/

