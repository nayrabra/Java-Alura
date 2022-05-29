public class Conta {
	private double saldo; //por conta do private o saldo agora nao pode ser lido 
	//e nem modificado, a nao ser pela propria classe
	int agencia;
	int numero;
	Cliente titular; 
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true; //return sendo true pára a execuçao daquele metodo
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}