import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
		int x, y, r;

		Scanner teclado = new Scanner(System.in);

		boolean deuCerto = false;
		do {
			try {
				System.out.println("Cadastre seu produto...");
				Produto p = new Produto();
				p.setId(Integer.parseInt(teclado.nextLine()));
				p.setDescricao(teclado.nextLine());
				p.setPreco(Float.parseFloat(teclado.nextLine()));

				System.out.println("Produto cadastrado");
				System.out.println(p);
				deuCerto = true;
			}
			catch(IsiException ex) {
				System.out.println("ISIError: Erro de cadastro: Motivo "+ex.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Ops... por favor digite um numero inteiro");
			} catch (ArithmeticException e) {
				System.out.println("Ops... nao sei fazer divisao por zero");
			} catch (IllegalStateException e) {
				System.out.println("Verifique o codigo.. scanner fechou indevidamente");
			} catch (RuntimeException e) {
				System.out.println("Erro ao cadastrar produto");
				System.out.println("MOTIVO " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Ops.. nao sei o que aconteceu... mas nao rolou");
				System.out.println(e.getClass().getName());
			}
		} while (!deuCerto);
		teclado.close();

	}

}