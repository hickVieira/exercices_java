import java.util.Random;
import java.util.Scanner;

class Lista5_Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int iSize = 10;
        int jSize = 10;
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

        System.out.println("\nsoma de cada linha:");

        // somar + imprimir
        for (int i = 0; i < iSize; i++) {
            int sum = 0;
            for (int j = 0; j < jSize; j++)
                sum += array[i][j];
            System.out.println(sum);
        }
    }
}