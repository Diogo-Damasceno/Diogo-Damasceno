import java.util.Scanner;

public class DVAD25 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD25 - Exercício 25: Tabuada com while
        // *************************************************

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número para a tabuada: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }
        sc.close();
    }
}
