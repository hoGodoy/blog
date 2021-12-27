package bootcamp;

public class Main {

	public static void main(String[] args) {
		
		//Calculadora
		System.out.println("Exercício calculadora");
		Calculadora.soma(3, 8);
		Calculadora.subtracao(18, 2.5);
		Calculadora.multiplicacao(2, 6);
		Calculadora.divisao(7.6, 1.2);
		
		//Exercício da saudação
		
		System.out.println("Exercício da saudação");
		Saudacao.obterSaudacao(9);
		Saudacao.obterSaudacao(14);
		Saudacao.obterSaudacao(1);
		Saudacao.obterSaudacao(0);
		
		//Exercício de emprestimo
		
		System.out.println("Exercício de empréstimo");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 4);
		
		System.out.println("Teste passando as quantidades de parcelas");
		Emprestimo.calcular(1000, 2);
		Emprestimo.calcular(1000, 3);

	}
	
}
