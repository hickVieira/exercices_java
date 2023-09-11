import java.util.Random;
import java.util.Scanner;

class Lista5_Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int iSize = 10;
        int jSize = 10;
        int[][] array = new int[iSize][jSize];

        // gen rand
        for (int i = 0; i < iSize; i++)
            for (int j = 0; j < jSize; j++)
                array[i][j] = rand.nextInt(100);

        // imprimir
        for (int i = 0; i < iSize; i++) {
            System.out.print("\n");
            for (int j = 0; j < jSize; j++)
                System.out.print(array[i][j] + " ");
        }

        // select linha
        int lineSel;
        do {
            System.out.print("\nDigite o número da linha (entre 0 e 9): ");
            lineSel = scanner.nextInt();
        } while (lineSel < 0 || lineSel > 9);

        // copiar os elementos da linha selecionada para um vetor
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++)
            vetor[i] = array[lineSel][i];

        // Imprimir o vetor
        System.out.println("Vetor gerado a partir da linha selecionada:");
        for (int i = 0; i < 10; i++)
            System.out.print(vetor[i] + " ");
    }
}