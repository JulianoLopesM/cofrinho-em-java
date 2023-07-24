package Uninter;

public class Real extends Moeda {
	
	public Real(double valorDeInicio) {
		this.valor = valorDeInicio; 
		
	}

	@Override
	public void info() {
		System.out.println("Real - " + valor);
		
	}

	@Override
	public double converter() {
		return this.valor;
		
	}

	@Override
	public boolean equals(Object obj) {      //Essa linha de código verifica se o objeto passado como parâmetro tem a mesma classe do objeto atual.
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		Real objDeReal = (Real) obj;
		
		if(this.valor != objDeReal.valor) {
			return false;
		}
		
		
		return true;
	}
	
}
