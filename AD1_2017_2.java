public class AD1_2017_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prova superprova = new Prova(2);//Passando a quantidade de questões
		/**
		 * A questão não deixa claro o que deve ser feito caso o numero de questões
		 * Diferente de dois
		 * Estou construindo o OBJ como pedido no enunciado porém o construtor do 
		 * OBJ prova não é capaz de manipular a criação de novas questões.
		 * Além disso acredito que se fosse o caso era preciso informar o tipo da questão.
		 * Entretanto nada disso foi pedido no enunciado
		 */
		
		int num = 1;
		for(Questao q : superprova.prova) {
			
			System.out.print(num + ") "); 
			if(!(q instanceof VerdadeiroFalso)){//Se não é Verdadeiro ou falso
				System.out.println(q.getEnunciado());// Chamada do método toString() para cada questão q
			}else{
				System.out.println(q.getEnunciado());
				
				for(ItemVerdadeiroFalso i : superprova.itens){
					System.out.println("()"+i.texto);
				}
			}
			num++;
			}
	}
}
