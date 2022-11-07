package Random;

import java.util.Random;

import javax.swing.JOptionPane;

public class GeradordeNumerosAleatorios {
	public static void main(String[] args) {
		Random random = new Random();
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos números serão gerados: "));
		int[] valores = new int[tamanho];

		int rand = Integer.parseInt(JOptionPane.showInputDialog("Números inteiros entre 0 e: ? "));
		String s = "";

		for (int i = 0; i < valores.length; i++) {
			int aleatorio = random.nextInt(rand);

			s += aleatorio + " " + ", ";

		}
		JOptionPane.showMessageDialog(null, "Os números sorteados são: " + s);

	}

}
