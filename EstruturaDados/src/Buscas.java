import java.util.ArrayList;
import java.util.HashMap;

public class Buscas {
	public static void main(String args[]) {
		
		long ini, fim;

		/* Versao 1.0 - Usando ArrayList para buscar */
		/*
		ArrayList<Produto> lista = new ArrayList<Produto>();
		// "simulando recuperar de um banco de dados"
		for (int i = 0; i < 100000; i++) {
			lista.add(new Produto(i, "Produto" + i));
		}
		int produtoABuscar = -1;
		ini = System.currentTimeMillis();
		for (int vezes = 0; vezes < 10000; vezes++) {
			for (int i = 0; i < lista.size(); i++) {
				if (produtoABuscar == lista.get(i).getId()) {
					System.out.println("Achei!");
					break;
				}
			}
		}
		fim = System.currentTimeMillis();
		*/
		
		/* Versao 2.0 Usando Mapas Hash para buscar */
		// simulando recuperar dados do banco de dados
		HashMap<Integer, Produto> mapa = new HashMap<Integer, Produto>();
		for (int i=0; i<100000; i++) {
			mapa.put(i, new Produto(i, "Produto"+i));
		}
		
		// procurar um valor dentro deste conjunto
		int produtoABuscar = -1;
		ini = System.currentTimeMillis();
		for (int vezes=0; vezes < 10000; vezes++) {
		   Produto p = mapa.get(produtoABuscar);
		   if (p != null){
			   System.out.println("Achei!");
		   }
		}
		fim = System.currentTimeMillis();
		

		System.out.println("Fim do programa");
		System.out.println("Demorei "+(fim-ini)+" milesimos de segundo");

	}

}