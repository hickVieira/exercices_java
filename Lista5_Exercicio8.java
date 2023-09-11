import java.util.Random;
import java.util.Scanner;

class Lista5_Exercicio8 {
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

        // select coluna
        int colSel;
        do {
            System.out.print("\nDigite o número da coluna (entre 0 e 9): ");
            colSel = scanner.nextInt();
        } while (colSel < 0 || colSel > 9);

        // valor para multiplicação
        System.out.print("\nDigite um valor para multiplicar os elementos da coluna: ");
        int mult = scanner.nextInt();

        // multiplicar os elementos
        for (int i = 0; i < iSize; i++)
            array[i][colSel] *= mult;

        // print
        for (int i = 0; i < iSize; i++) {
            System.out.print("\n");
            for (int j = 0; j < jSize; j++)
                System.out.print(array[i][j] + " ");
        }
    }
}