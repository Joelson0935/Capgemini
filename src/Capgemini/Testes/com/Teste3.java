package Capgemini.Testes.com;

public class Teste3 {
	/*
	*@author JOELSON
	* Este algorítimo calcula o fatorial das Strings que forem setadas como argumento para o método
	* @param nome
	*/
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
