package controller;

public class Metodos {

		public static int multiplica (int A, int B) {
			
			// Aqui temos "A" como base, reprensentando quantas vezes devemos somar o valor de "B"
			// Quando "A" chega a zero paramos de somar
			
			if (A <= 0) {
				return 0;
			}
			
		    // Somamos "B" mais uma vez e decrementamos "A" 
			
			else {
				return (multiplica (A - 1, B)) + B;
			}
			
		}
}
