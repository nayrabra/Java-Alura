//nao pode instanciar objetos dessa classe, pq é abstrata (na classe) / n pode dar new
//os filhos nao perdem a herança
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario; 
	//tbm tem o protected q está entre o private e public e significa...
	//public para os filhos e para si, para as demais classes private.
	
	//set = preenche os dados
	//get = recebe os dados
	
	//abstract no metodo significa metodo sem corpo, não há implementaçao aqui na mae
	//um método abstrato define apenas a assinatura (visibilidade, retorno...
	// ...nome do método e parâmetros)
	//a implementaçao sera nos filhos
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
