package Uninter;

import java.util.Scanner;

public class Menu {
	
	private Scanner teclado;
	private Cofrinho cofrinho;
	
     public Menu() {
    	 teclado = new Scanner(System.in);
    	 cofrinho = new Cofrinho();
    	 
     }
     
	public void menuPrincipal() {
		
		System.out.println("COFRINHO:");
		System.out.println("1-Adicionar moeda");
		System.out.println("2-Remover moeda");
		System.out.println("3-Listar moedas");
		System.out.println("4-Calcular valor total convertido para real");
		System.out.println("0-Encerrar");
		
		String selecioneOpcao = teclado.next();
		
	    switch (selecioneOpcao) {
	     case "0":
	    	System.out.println(" O Menu foi finalizado");
	    	break;
	    case "1":
	    	subMenuDasMoedas();// com o objetivo de tornar os cases mais bonitos , os submenus foram criados
	    	menuPrincipal();
	    	break;
	    	
	    case "2":
	    	subMenuRemoverDasMoedas();
	    	menuPrincipal();
	    	break;
	    	
	    	
	    case "3":
	    	cofrinho.listagem();
	    	menuPrincipal();
	    	break;
	    
	    case "4":
	    	subMenuConverterMoedas();
	    	menuPrincipal();
	    	break;
	    	
	    default:
	    	System.out.println("Opção inválida!");
	    	menuPrincipal();
	    	break;
	    	
	    	
	    }
	}
	private void subMenuDasMoedas() {
		
		System.out.println("Escolha um Moeda: ");
    	System.out.println("1 - Real: ");
    	System.out.println("2 - Dolar: ");
    	System.out.println("3 - Euro: ");
    	
    	int opMoeda = teclado.nextInt();
    	
    	System.out.println("digite o valor:");
    	String valorMoedaEmTexto = teclado.next();
    	
    	valorMoedaEmTexto = valorMoedaEmTexto.replace(",", ".");
    	
        double valorMoeda = Double.parseDouble(valorMoedaEmTexto);
    	
        Moeda moeda = null;
        
    	if (opMoeda == 1) {
    		 moeda = new Real(valorMoeda);
    	}else if(opMoeda == 2) {
    		 moeda = new Dolar(valorMoeda);
    	}else if(opMoeda == 3) {	    		
    		 moeda = new Euro(valorMoeda);
    	}else {
    		System.out.println("Não existe essa moeda em nosso sistema de conversão!");
    		menuPrincipal();
    	}
        
    	cofrinho.adicionar(moeda);
    	System.out.println("A moeda foi adicionada ao seu cofrinho!");
	}
	
       private void subMenuRemoverDasMoedas() {
		
		System.out.println("Escolha um Moeda: ");
    	System.out.println("1 - Real: ");
    	System.out.println("2 - Dolar: ");
    	System.out.println("3 - Euro: ");
    	
    	int opMoeda = teclado.nextInt();
    	
    	System.out.println("digite o valor:");
    	String valorMoedaEmTexto = teclado.next();
    	
    	valorMoedaEmTexto = valorMoedaEmTexto.replace(",", ".");
    	
        double valorMoeda = Double.parseDouble(valorMoedaEmTexto);
    	
        Moeda moeda = null;
        
    	if (opMoeda == 1) {
    		 moeda = new Real(valorMoeda);
    	}else if(opMoeda == 2) {
    		 moeda = new Dolar(valorMoeda);
    	}else if(opMoeda == 3) {	    		
    		 moeda = new Euro(valorMoeda);
    	}else {
    		System.out.println("Não existe essa moeda!");
    		menuPrincipal();
    	}
        
    	boolean moedaRemovida = cofrinho.remover(moeda);
    	if(moedaRemovida) {    		
    		System.out.println("A Moeda foi removida com sucesso");
    	}else {
    		System.out.println("Não foi possivel encontrar nenhuma moeda com esse valor!");    		
    	}
	}
       
       private void subMenuConverterMoedas() {
    	   double valorTotalConvertidoDasMoedas = cofrinho.totalConvertido();	    	
	    	String valorTotalConvertidoDasMoedasEmTexto = String.format("%.2f", valorTotalConvertidoDasMoedas);
	    	valorTotalConvertidoDasMoedasEmTexto = valorTotalConvertidoDasMoedasEmTexto.replace(".", ",");
	    	System.out.println("O valor total convertido para real: " + valorTotalConvertidoDasMoedasEmTexto);
       }
	
}
  