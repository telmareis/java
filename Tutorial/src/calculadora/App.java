package calculadora;

public class App {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		System.out.println("A multiplicação é: " + calculadora.multiplicar(7, 8));
		
		System.out.println("A soma é: " + calculadora.somar(6,  6));
		
	}

}
