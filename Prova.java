
public class Prova {
	int nquestoes;
	Questao[] prova;
	ItemVerdadeiroFalso[] itens;
	Prova(int _nquestoes){
		nquestoes = _nquestoes;
		prova = new Questao[nquestoes];
		prova[0] = new Discursiva("Qual é o número da última versão de Java?","8");
		itens = new ItemVerdadeiroFalso[3];
		itens[0] = new ItemVerdadeiroFalso("Java foi lançada há mais de 20 anos atrás", true);
		itens[1] = new ItemVerdadeiroFalso("OO surgiu com a linguagem Java", false);
		itens[2] = new ItemVerdadeiroFalso("Eclipse é um editor de texto multilinguagem", true);
		prova[1] = new VerdadeiroFalso("Assinale verdadeiro ou falso para os itens:", itens);
		
	}

	
}
