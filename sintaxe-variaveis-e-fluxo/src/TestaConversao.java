
public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1270.50;
		
		int valor = (int) salario; //é necessário fazer um type casting: "(int)" para compilar, já q o salario era um double
		System.out.println(valor);
		
		long numeroGrande = 65156152151L; //L no final
		short valorPequeno = 2131;
		byte b = 127; //só vai do -128 ao 127
		float pontoFlutuante = 3.14F; //F no final
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
	}
}
