package AvatarGen;

import java.util.Scanner;

public class apresentacao extends BaseAvatar { 
	Scanner ler = new Scanner(System.in);
	
	    int falarcomquem;
	    
	    
	  
	   
	
	public void apresentar() {
		this.setNome("Manu");
		this.setIdade(19);
		this.setgenero("não-binárie");
		System.out.println("Olá, eu sou "+this.getNome()+", muito prazer!!\n Tenho "+this.getIdade()+" anos e sou uma pessoa "+this.getgenero()+".\n Estou aqui para te ajudar nessa trajetória e tirar suas dúvidas...\n");
		
    } 
	public void falarcomManuOuManu2() {
		
		System.out.println("Se você quer saber mais sobre a Generation digite o número correspondente as opções abaixo:");
		System.out.println("1- Para conhecer a Generation");
		System.out.println("2- Para tirar sua duvidas");
		falarcomquem=ler.nextInt();
			
		}
		
	public void falarcomManuOuManu2erro() {
		
		while(falarcomquem!=1||falarcomquem!=2) {
		System.out.println("Numero invalido tente novamente");
		System.out.println("1- Para conhecer a Generation");
		System.out.println("2- Para tirar sua duvidas");
		falarcomquem=ler.nextInt();
		
		}
		
	}
	

}
