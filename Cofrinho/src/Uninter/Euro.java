package Uninter;

public class Euro extends Moeda {
	
	
	public Euro(double valorDeInicio) {
		this.valor = valorDeInicio; 
		
	}

	@Override
	public void info() {
		System.out.println("Euro - " + valor);
		
	}

	@Override
	public double converter() {
		
		return this.valor * 5.3;
	}
	public boolean equals(Object obj) {
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		Euro objDeEuro = (Euro) obj;
		
		if(this.valor != objDeEuro.valor) {
			return false;
		}
		
		
		return true;
	}

}
