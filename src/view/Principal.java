package view;

import controller.PotenciaController;

public class Principal {

	public static void main(String[] args) {
		PotenciaController pc = new PotenciaController();
		int base = 2;
		int expoente = 5;
		
		int pot = pc.pot(base, expoente);
		System.out.println("Com laço ==> " +pot);
		
		int potencia = pc.potencia(base, expoente);
		System.out.println("Com recursividade ==> " +potencia);
	}

}

/*OBSERVAÇÃO: Se utilizássemos o int base = 2 e o int expoente = 600,
 *teremos um estouro da memória, isto é, um Stack Overflow! 
 *Tanto no laço, quanto na recursividade, o resultado será zero!
 */


