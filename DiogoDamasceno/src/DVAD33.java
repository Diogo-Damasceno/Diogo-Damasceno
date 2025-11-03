import java.util.Scanner;

public class DVAD33 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD33 - Exercício 33: Menu com opção de sair (do..while)
        // *************************************************

        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.println("1 - Mensagem\n2 - Sair");
            System.out.print("Escolha: ");
            opc = sc.nextInt();
            if (opc == 1) {
                System.out.println("Você escolheu a mensagem!");
            }
        } while (opc != 2);
        sc.close();
    }
}
