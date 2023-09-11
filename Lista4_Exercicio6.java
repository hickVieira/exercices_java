import java.util.Random;
import java.util.Scanner;

class Lista4_Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor x >> ");
        int valorX = Integer.parseInt(scanner.nextLine());

        Random rand = new Random();
        int[] A = new int[10];
        int[] B = new int[10];

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(51);
            B[i] = A[i] * valorX;
        }

        for (int i = 0; i < A.length; i++)
            System.out.println(String.format("A[%d] = %d", i, A[i]));
        for (int i = 0; i < B.length; i++)
            System.out.println(String.format("B[%d] = %d", i, B[i]));
    }
}