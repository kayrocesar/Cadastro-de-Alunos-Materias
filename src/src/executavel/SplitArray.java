package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {

		String texto = "alex,curso Java,80,70,90,100";
		String valores[] = texto.split(",");

		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}

		// Convertendo array em lista
		List<String> listajunta = Arrays.asList(valores);

		for (String valor : listajunta) {
			System.out.println(valor);
		}

		/* Convertendo uma lista para Array */

		String conversaoArray[] = listajunta.toArray(new String[6]);

		for (String valor : conversaoArray) {
			System.out.println(valor);
		}

	}

}
