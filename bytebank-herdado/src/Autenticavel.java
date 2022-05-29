//interface: nao pode ter nada concreto, todos os metodos devem ser abstratos
//Usando interfaces temos uma outra forma de conseguir polimorfismo sem herança
//interface é um contrato onde quem assina se responsabiliza...
//...por implementar esses métodos (cumprir o contrato)
//todos os métodos na interface são sempre abstratos e sempre públicos.
//Em uma classe abstratos podemos ter métodos concretos e abstratos.
//contrato Autenticavel 
//qm assinar o contrato precisa implementar os metodos: setSenha e autentica 
public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
}


