import java.util.*;
public class frase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = "Yeah eu te amo muito mas agora é tarde eu vou dormir";
		int n, i;
		for (i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ' && i > 6 && i != 10 && i != 20 && i != 32 && i != 41) {
				for (n = 0; n < i; n++) {
					System.out.print(frase.charAt(n));
				}
				System.out.print("\n");
			}
		}
		System.out.println(frase);
		for (i = frase.length() - 1; i >= 0; i--) {
			if (frase.charAt(i)== ' ' && i > 6 && i != 10 && i != 20 && i != 32 && i != 41) {
				for (n = 0; n < i; n++) {
					System.out.print(frase.charAt(n));
				}
				System.out.print("\n");
			}
		}
	}

}
