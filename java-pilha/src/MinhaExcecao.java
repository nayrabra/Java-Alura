//precisa fazer com a classe MinhaExcecao herde de alguma classe na hierarquia de Throwable. 
//Por exemplo Exception:
//nao pode extender diretamenta p throwable
public class MinhaExcecao  extends Exception{ //checked

		public MinhaExcecao(String msg) {
			super(msg);
			
		}
}
