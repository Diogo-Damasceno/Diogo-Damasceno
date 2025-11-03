public class DVAD28 {
    public static void main(String[] args) {
                // *************************************************
        // Aluno Diogo Vinicius Abreu Damasceno
        // Projeto: DiogoDamasceno
        // Classe DVAD28 - Exercício 28: Soma dos pares entre 1 e 100
        // *************************************************

        int soma = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) soma += i;
            i++;
        }
        System.out.println("Soma dos pares entre 1 e 100 = " + soma);
    }
}
