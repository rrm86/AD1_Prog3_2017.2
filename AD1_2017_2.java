public class AD1_2017_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prova superprova = new Prova(2);//Passando a quantidade de questões
		/**
		 * O enunciado da letra B não deixa claro o que deve ser feito caso o numero de questões
+		 * Seja Diferente de dois
+		 * Estou construindo o OBJ como pedido no enunciado porém o construtor da 
+		 * Classe prova não é capaz de manipular a criação de novas questões.
		 *	
 		 * Caso fosse necessário criar uma questão "inédita" também seria preciso informar o tipo da questão.
 		 * Entretanto nada disso foi pedido no enunciado
 		 */
		
		superprova.imprimeProva();
		
	}
}
