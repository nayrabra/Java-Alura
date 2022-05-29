
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo); //200.0
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo); //300.0
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		
		System.out.println("primeira conta tem " + primeiraConta.saldo); //300.0
		System.out.println("segunda conta tem " + segundaConta.saldo); //50.0
		
		primeiraConta.agencia = 146;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println("agora a segunda conta está "
				+ "na agencia " + segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		} else {
			System.out.println("contas diferentes");
		}

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}
}
