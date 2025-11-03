import java.util.Scanner;

public class DVAD07 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD07 - Exercício 7: Triângulo válido
        // *************************************************

        Scanner sc = new Scanner(System.in);
        System.out.print("Lado A: ");
        double a = sc.nextDouble();
        System.out.print("Lado B: ");
        double b = sc.nextDouble();
        System.out.print("Lado C: ");
        double c = sc.nextDouble();

        // Regra do triângulo: cada lado menor que soma dos outros dois
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Triângulo válido.");
        } else {
            System.out.println("Não forma um triângulo.");
        }

        sc.close();
    }
}
