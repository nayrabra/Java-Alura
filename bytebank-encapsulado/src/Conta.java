public class Conta {
	private double saldo; //por conta do private o saldo agora nao pode ser lido 
	//e nem modificado, a nao ser pela propria classe
	private int agencia;
	private int numero;
	private Cliente titular; 
	private static int total; //static faz com q o atributo seja da classe...
	//e não mais do objeto. Com isso, todo o objeto conta possui acesso a um único total.
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("o total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta " + this.numero);
	}
	
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
	
	//Na criação dos métodos para acesso aos atributos privados podemos colocar...
	//GET ou SET antes do nome do atributo.
	//get é p acessar, "pegar" alguns atributos da classe... 
	//sempre retornará um valor, seja ele String, int ,double etc.
	///set é p alterar, modificar os valores de um atributo da classe de maneira protegida...
	///porém o set não terá um retorno, pois o atributo será somente modificado...
	///criando um método de tipo VOID, sem retorno... 
	///Porém ele deve receber algum argumento para que possa ocorrer a devida alteração. 
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("nao pode valor <= 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("nao pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}