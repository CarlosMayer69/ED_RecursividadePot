package view;

import controller.PotenciaController;

public class Principal {

	public static void main(String[] args) {
		PotenciaController pc = new PotenciaController();
		int base = 2;
		int expoente = 5;
		
		int pot = pc.pot(base, expoente);
		System.out.println("Com la?o ==> " +pot);
		
		int potencia = pc.potencia(base, expoente);
		System.out.println("Com recursividade ==> " +potencia);
	}

}

/*OBSERVA??O: Se utiliz?ssemos o int base = 2 e o int expoente = 600,
 *teremos um estouro da mem?ria, isto ?, um Stack Overflow! 
 *Tanto no la?o, quanto na recursividade, o resultado ser? zero!
 */


