
public class ControleBonificacao {
	
	private double soma;

	//Temos apenas um método genérico e, mesmo assim, o método específico será chamado. 
	//É esta a vantagem do polimorfismo.
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}	
	
	public double getSoma() {
		return soma;
	}
}
