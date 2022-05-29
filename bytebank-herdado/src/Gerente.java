//Gerente é um Funcionario, Gerente herda da class Funcionario
//Gerente é um Autenticavel, Gerente assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador; //atributo atenticador guardado

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();//criando autenticacao util
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificacao do GERENTE");
		return super.getSalario(); 
		//super = pega da classe mae ou super classe o metodo ou atributo
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha); //quem vai guardar a senha é o util
		
	}

	@Override
	public boolean autentica(int senha) { //delegando a autenticaçao
		return this.autenticador.autentica(senha);
	}

	
}
