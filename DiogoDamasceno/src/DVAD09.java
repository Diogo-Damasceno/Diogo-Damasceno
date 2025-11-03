import java.util.Scanner;
import java.util.Arrays;

public class DVAD09 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD09 - Exercício 9: Ordem crescente (três números)
        // *************************************************

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[3];
        System.out.print("Digite o primeiro número: ");
        nums[0] = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        nums[1] = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        nums[2] = sc.nextInt();

        Arrays.sort(nums); // ordena o array
        System.out.println("Ordem crescente: " + nums[0] + ", " + nums[1] + ", " + nums[2]);

        sc.close();
    }
}
