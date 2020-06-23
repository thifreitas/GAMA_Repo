import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class ProvaTeste {
	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		int acertos=0;
		String resp;
		
		// Versão original com vetor (tamanho imutável, não é redimensionável)
		/*QuestaoSimples prova[] = new QuestaoSimples[5];
		
		prova[0] = new QuestaoSimples("Quem Descobrio o Brasa?","PA Cabral");
		prova[1] = new QuestaoComDica("Qual a cor do cavalo branco de Napoleao?","Marrom","Leia o enunciado");
		prova[2] = new QuestaoMultiplaEscolha("Qual a formula da água?", "H2O","NaCl","H2SO4", "H2O", "H2OH");
		prova[3] = new QuestaoComDica("Qual a linguagem do curso?","JAVA","Começa com JA e termina com VA");
		prova[4] = new QuestaoSimples("Qual a cor do céu?","Azul");
		*/
		
		/*HashMap<Integer, QuestaoSimples> mapa = new HashMap<Integer, QuestaoSimples>();
		mapa.put(1,new QuestaoSimples("Quem Descobriu o Brasa?","PA Cabral"));*/
		
		// Versão 2 - Com arrays Redimensionáveis (ArrayList do pacote java.util)
		ArrayList<QuestaoSimples> prova;
		
		prova = new ArrayList<QuestaoSimples>(); // aqui eu não especifico o tamanho
		
		prova.add(new QuestaoSimples("Quem Descobriu o Brasa?","PA Cabral"));
		prova.add(new QuestaoComDica("Qual a cor do cavalo branco de Napoleao?","Marrom","Leia o enunciado"));
		prova.add(new QuestaoMultiplaEscolha("Qual a formula da água?", "H2O","NaCl","H2SO4", "H2O", "H2OH"));
		prova.add(new QuestaoComDica("Qual a linguagem do curso?","JAVA","Começa com JA e termina com VA"));
		prova.add(new QuestaoSimples("Qual a cor do céu?","Azul"));
		
		for (QuestaoSimples q : prova) {
			System.out.println(q.aplicarQuestao());
			resp = teclado.nextLine();
			if (q.corrigir(resp)) {
				acertos++;
			}
		}
		System.out.println("Voce acertou um total de "+acertos+"/"+prova.size());
	}

}