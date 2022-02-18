package Capgemini.Testes.com;

public class Teste3 {

	public static void Anagrama(String nome) {
		char[] array = nome.toCharArray();
		int cont = 1;
		for (int i = 0; i < array.length; i++) {
			cont *= i + 1;
		}
		System.out.println("Fatorial = " + cont);

	}

	public static void main(String[] args) {

		Anagrama("italo");
	}

}
