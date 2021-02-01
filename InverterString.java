package dia5;

import java.util.Scanner;

public class InverterString {

	public static void main(String[] args) {
		System.out.print("Digite uma palavra: ");
		Scanner leitor = new Scanner(System.in);
		String  entrada = leitor.next();
		String saida = "";
		
		for( int i = entrada.length() - 1; i>= 0; i--) {
			saida = saida +entrada.charAt(i);
		}	
		System.out.println(" Esta palavra escrita invertida é: " + saida);
		
		leitor.close();
	}
	
	

	
}
