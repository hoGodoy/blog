package sobrecarga;

public class Quadrilatero {
	
	public static void area(double lado) {
		System.out.println("�rea do quadrado de lado " + lado + " � " + (lado * lado));
	}
	

	public static void area(double base, double altura) {
		System.out.println("�rea do ret�ngulo de base " + base + " e altura " + altura +" � " + (base * altura));
	}
	

	public static void area(double baseMaior, double baseMenor, double altura) {
		System.out.println("�rea do trap�zio de base maior " + baseMaior + " e base menor " + baseMenor + " e altura "+ altura + " � " + (((baseMaior + baseMenor)* altura)/2));
	}

}
