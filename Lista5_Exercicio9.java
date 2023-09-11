import java.util.Random;
import java.util.Scanner;

class Lista5_Exercicio9 {
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

        // trocar elementos
        for (int i = 0; i < iSize; i++) {
            int temp = array[i][i];
            array[i][i] = array[i][iSize - 1 - i];
            array[i][iSize - 1 - i] = temp;
        }

        // print
        for (int i = 0; i < iSize; i++) {
            System.out.print("\n");
            for (int j = 0; j < jSize; j++)
                System.out.print(array[i][j] + " ");
        }
    }
}