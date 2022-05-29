//a classe herda os metodos e atributos, nao tem herança de construtores
public class ContaCorrente extends Conta implements Tributavel {

	
	public ContaCorrente(int agencia, int numero) { //o construtor aqui é agencia e nº
		super(agencia, numero);
	}
	
	@Override //= sobrescrever o metodo da classe mae
	public void saca(double valor) {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo *0.01;
	}
}
