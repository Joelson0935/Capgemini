package Capgemini.Testes.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste1 {

	/**
	 * @author JOELSON 
	 * Este algorítimo cria uma pirâmide de asteriscos e espaços
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade de escadas");
		int quantidade = scan.nextInt();
		String espaco = " ";
		List<String> lista = new ArrayList<>();
		for (int i = 0; i < quantidade; i++) {
			lista.add(espaco.repeat(quantidade - i - 1).concat("*".repeat(i + 1)));
		}
		System.out.println();
		for (String s : lista) {
			System.out.println(s);
		}
		scan.close();
	}

}
