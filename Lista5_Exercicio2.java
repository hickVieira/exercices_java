import java.util.Random;

class Lista5_Exercicio2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int iSize = 10;
        int jSize = 10;
        int[][] array = new int[iSize][jSize];

        // gen rand
        for (int i = 0; i < iSize; i++)
            for (int j = 0; j < jSize; j++)
                array[i][j] = 1 + rand.nextInt(50);

        // find min
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < iSize; i++)
            for (int j = 0; j < jSize; j++)
                min = Math.min(min, array[i][j]);

        // imprimir
        for (int i = 0; i < iSize; i++) {
            System.out.print("\n");
            for (int j = 0; j < jSize; j++)
                System.out.print(array[i][j] + " ");
        }

        System.out.println("\nMin = " + min);
    }
}