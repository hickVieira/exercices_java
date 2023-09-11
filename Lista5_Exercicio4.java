import java.util.Random;
import java.util.Scanner;

class Lista5_Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int iSize = 7;
        int jSize = 4;
        int[][] array = new int[iSize][jSize];

        // gen rand
        for (int i = 0; i < iSize; i++)
            for (int j = 0; j < jSize; j++)
                array[i][j] = 1 + rand.nextInt(50);

        // imprimir
        for (int i = 0; i < iSize; i++) {
            System.out.print("\n");
            for (int j = 0; j < jSize; j++)
                System.out.print(array[i][j] + " ");
        }

        int selCol;

        do {
            System.out.print("\nDigite o número da coluna (entre 0 e 3): ");
            selCol = scanner.nextInt();
        } while (selCol < 0 || selCol > 3);

        // imprimir a coluna selecionada
        System.out.println("coluna selecionada:");
        for (int i = 0; i < iSize; i++)
            System.out.println(array[i][selCol] + " ");
    }
}