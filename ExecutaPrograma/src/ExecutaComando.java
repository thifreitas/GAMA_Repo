
public class ExecutaComando {

	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int opcao=0;
		do{
			try{
				Process p = Runtime.getRuntime().exec("./script.sh");exe
				System.out.println("1- Cadastro");
				System.out.println("2- Consulta");
				System.out.println("3- Alteracao");
				System.out.println("4- Relatorio");
				opcao = teclado.nextInt();
			}
			catch(Exception ex){
				ex.printStackTrace();
			}

		}while (opcao != -1);


	}

}
