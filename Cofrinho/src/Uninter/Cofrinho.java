package Uninter;

import java.util.ArrayList;

public class Cofrinho {
	
	private ArrayList<Moeda> listaMoedas;  //Criando a lista privada
	
	public Cofrinho() {
		
		this.listaMoedas = new ArrayList<>();
		
		
	}
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
		
	}
	
	public boolean remover(Moeda moeda) {
		
		return this.listaMoedas.remove(moeda);
	}
	
	public void listagem() {
		
		if(this.listaMoedas.isEmpty()) {
			
			System.out.println("O cofrinho não possui moedas ainda, digite 1 para adiciona-las!");
			return;
		}
		
		for(Moeda moeda: this.listaMoedas) {
			
			moeda.info();
		}
		
	}
	public double totalConvertido() {
		
		if (this.listaMoedas.isEmpty()) {
			
			return 0;
		}
		double valorAcumulado = 0;
     
		for(Moeda moeda: this.listaMoedas) {
			valorAcumulado = valorAcumulado + moeda.converter();
		}
		return valorAcumulado;
	}
           
}
