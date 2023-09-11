import java.util.Random;

class Lista5_Exercicio6 {
    public static void main(String[] args) {
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

        System.out.println("\nsoma de cada coluna:");

        // somar + imprimir
        for (int j = 0; j < iSize; j++) {
            int sum = 0;
            for (int i = 0; i < jSize; i++)
                sum += array[j][i];
            System.out.print(sum + " ");
        }
    }
}