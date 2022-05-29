
public class Fatorial {
	
	public static void main(String[] args) {
		int fatorial = 1; 
		for(int i = 1; i <= 10; i++) {
			
			fatorial *= i; //fatorial = fatorial * i
						   //1 = 1 * 1 = 1
						   //1 = 1 * 2 = 2
						   //2 = 2 * 3 = 6
						   //6 = 6 * 4 = 24
						   //24 = 24 * 5 = 120
						   //120 = 120 * 6 = 720
						   //720 = 720 * 7 = 5040
						   //5040 = 5040 * 8 = 40320
						   //40320 = 40320 * 9 = 362880
						   //362880 = 362880 * 10 = 3628800
			System.out.println("Fatorial de " + i + " = " + fatorial);
		}
	}
}
