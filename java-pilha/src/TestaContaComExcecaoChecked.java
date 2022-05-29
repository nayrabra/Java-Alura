
public class TestaContaComExcecaoChecked {
	public static void main(String[] args) {
		
		Conta c = new Conta();
		try {
			c.deposita(); //deposita tem excecao checked
		} catch(MinhaExcecao ex) {
			System.out.println("tratamento ....");
		}
		
	}
}
