
public class Fluxo {

    public static void main(String[] args) {
    	
        System.out.println("Ini do main");
        try {
        	metodo1();	
        } catch(Exception ex) { //a classe Exception captura toda e qqer exceçao, incluindo exceções checked
        	String msg = ex.getMessage();
        	System.out.println("Exception " + msg);
        	ex.printStackTrace();
        } 
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();      
        System.out.println("Fim do metodo1");
    }
    //tem que declarar o throws pq MinhaExcecao pertence a classe Exception(classe avó)...
    //...e é uma classe ckecked, ou seja, precisa ser verificada pelo compilador
    //tem 2 formas de RESOLVER UMA EXCECAO CHECKED: 
    //1)colocar na assinatura, através do throws
    //2)através do try catch, como na linha 7 (MinhaExcecao)
    //a classe RuntimeException (classe mae) é unchecked (nao verificada pelo compilador)
   
    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        
        throw new NullPointerException("deu muito ruim"); 
        //throw é um statement (declaração), que manda a exceção ser lançada 
        //pode colocar qqer exceçao que vai compilar
        
        //System.out.println("Fim do metodo2");
    }
}