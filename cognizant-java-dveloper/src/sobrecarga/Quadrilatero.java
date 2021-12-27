package sobrecarga;

public class Quadrilatero {
	
	public static void area(double lado) {
		System.out.println("Área do quadrado de lado " + lado + " é " + (lado * lado));
	}
	

	public static void area(double base, double altura) {
		System.out.println("Área do retângulo de base " + base + " e altura " + altura +" é " + (base * altura));
	}
	

	public static void area(double baseMaior, double baseMenor, double altura) {
		System.out.println("Área do trapézio de base maior " + baseMaior + " e base menor " + baseMenor + " e altura "+ altura + " é " + (((baseMaior + baseMenor)* altura)/2));
	}

}
