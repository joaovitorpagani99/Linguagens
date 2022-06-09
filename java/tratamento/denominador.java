import java.util.InputMismatchException;
import java.util.Scanner;

public class denominador {
    public class teste {

        public static int quotient(int numerador, int denominador) throws ArithmeticException {
            return numerador / denominador;
        }
    
        public static void main(String[] args) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite um numerador : ");
                int numerador = sc.nextInt();
                System.out.println("digite o denominador : ");
                int denominador = sc.nextInt();
                int result = quotient(numerador, denominador);
    
                System.out.println("Resultador : " + numerador + "/" + denominador + " = " + result);
    
            } catch (InputMismatchException joao) {
                System.out.println("Erro: sabe nem colocar um numero  ");
                joao.printStackTrace();
            } catch (ArithmeticException e) {
                System.out.println("ERRO: denominador zero larga de ser burro fdp");
                e.addSuppressed(e);
            } finally {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Digite um numerador : ");
                    int numerador = sc.nextInt();
                    System.out.println("digite o denominador : ");
                    int denominador = sc.nextInt();
                    int result = quotient(numerador, denominador);
    
                    System.out.println("Resultador : " + numerador + "/" + denominador + " = " + result);
    
                } catch (InputMismatchException joao) {
                    System.out.println("Erro:  ");
                    joao.printStackTrace();
                } catch (ArithmeticException e) {
                    System.out.println("ERRO: denominador zero ");
                    e.addSuppressed(e);
                }
            }
        }
    }
}