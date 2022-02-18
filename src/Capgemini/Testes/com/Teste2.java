package Capgemini.Testes.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Teste2 {
	/**
	 * @author JOELSON 
	 * 		   Este algor�timo serve para mostrar se uma senha tem mais de 6
	 *         caracteres e se a mesma est� com os requisitos pedidos que s�o: ao
	 *         menos uma letra mai�scula, uma letra min�scula, se cont�m n�meros e
	 *         caracteres especiais.
	 * @param senha
	 */
	public static void SenhaSegura(String senha) {

		String padrao = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.*[!#$%&@])[A-Za-z0-9!#%&@]{6,}$";
		Pattern pattern = Pattern.compile(padrao);

		int cont = 0;

		for (int i = 0; i < senha.length(); i++) {
			cont += 1;
		}

		Matcher matcher = pattern.matcher(senha);

		if (matcher.matches()) {
			System.out.println("Esta senha possui " + cont + " Caracteres e atende aos requisitos, portanto � segura.");
		} else {
			System.out
					.println("Esta senha possui " + cont + " Caracteres, N�O � segura pois n�o atende aos requisitos.");
		}
	}

	public static void main(String[] args) {

		SenhaSegura("Escola#1456");

	}

}
