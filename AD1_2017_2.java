
public class AD1_2017_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Questao[] prova = new Questao[2];
		prova[0] = new Discursiva("Qual é o número da última versão de Java?",
		"8");
		ItemVerdadeiroFalso[] itens = new ItemVerdadeiroFalso[3];
		itens[0] = new ItemVerdadeiroFalso("Java foi lançada há mais de 20 anos atrás", true);
		itens[1] = new ItemVerdadeiroFalso("OO surgiu com a linguagem Java", false);
		itens[2] = new ItemVerdadeiroFalso("Eclipse é um editor de texto multilinguagem", true);
		prova[1] = new VerdadeiroFalso(itens);
		int num = 1;
		for (Questao q : prova) {
			System.out.print(num + ") ");
			System.out.println(q); // Chamada do método toString() para cada
			questão q
			num++;
			}
	}

}
