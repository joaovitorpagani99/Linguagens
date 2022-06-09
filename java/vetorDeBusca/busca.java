import java.util.*;

public class busca{

	static void adiciona(int n, String x) {
		String[] v = new String[n];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < v.length; i++) {
			System.out.println("Digite algo: ");
			v[i] = sc.next();
		}
		acha(v, x);
	}

	static void acha(String[] v, String x) {
		boolean t = false;
		for (int i = 0; i < v.length; i++) {
			if (v[i].equalsIgnoreCase(x)) {
				t = true;
			}
		}
		if (t == true) {
			System.out.println("Encontrado");
		} else {
			System.out.println("Não encontrada");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de numeros ou letras que deseja armazenar: ");
		int n = sc.nextInt();
		System.out.println("Qual número ou letra deseja procurar ?");
		String x = sc.next();
		adiciona(n, x);

	}
}
