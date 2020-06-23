public class QuestaoMultiplaEscolha extends QuestaoSimples {
	protected String a1;
	protected String a2;
	protected String a3;
	protected String a4;
	
	public QuestaoMultiplaEscolha(String enunciado, String resposta, String a1, String a2, String a3, String a4) {
		super(enunciado, resposta);
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
	}
	
	public String aplicarQuestao() {
		return "Q:"+super.enunciado+"\n   a)"+a1+"\n   b)"+a2+"\n   c)"+a3+"\n   d)"+a4;
	}
	
	

}