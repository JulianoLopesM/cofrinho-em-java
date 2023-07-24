package Uninter;

public class Dolar extends Moeda {
	
	
	public Dolar(double valorDeInicio) {
		this.valor = valorDeInicio; 
		
	}

	@Override
	public void info() {
		System.out.println("Dolar - " + valor);
		
	}

	@Override
	public double converter() {
		
		return this.valor * 4.9;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		Dolar objDeDolar = (Dolar) obj;
		
		if(this.valor != objDeDolar.valor) {
			return false;
		}
		
		
		return true;
	}
	

}
