
public class VerdadeiroFalso extends Questao{
	ItemVerdadeiroFalso[] alternativas;
	
	public VerdadeiroFalso(String enunciado,ItemVerdadeiroFalso[] _array){
		super(enunciado);
		this.alternativas = _array;
	}

}
