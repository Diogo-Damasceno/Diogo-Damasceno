import java.util.Scanner;

public class DVAD30 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD30 - Exercício 30: Menu até escolher sair
        // *************************************************

        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.println("Menu:\n1 - Mensagem\n2 - Sair");
            System.out.print("Escolha uma opção: ");
            opc = sc.nextInt();
            if (opc == 1) {
                System.out.println("Você escolheu a mensagem!");
            } else if (opc != 2) {
                System.out.println("Opção inválida.");
            }
        } while (opc != 2);
        System.out.println("Programa encerrado.");
        sc.close();
    }
}
